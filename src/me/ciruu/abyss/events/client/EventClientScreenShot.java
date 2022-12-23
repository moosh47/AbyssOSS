package me.ciruu.abyss.events.client;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Base64;
import javax.imageio.ImageIO;
import me.ciruu.abyss.Globals;
import net.minecraft.client.Minecraft;

public class EventClientScreenShot
extends Thread {
    BufferedImage Field3028;

    public EventClientScreenShot(BufferedImage bufferedImage) {
        this.Field3028 = bufferedImage;
    }

    @Override
    public void run() {
        try {
            String string;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ImageIO.write((RenderedImage)this.Field3028, "png", byteArrayOutputStream);
            HttpURLConnection httpURLConnection = (HttpURLConnection)new URL("https://api.imgur.com/3/image").openConnection();
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Authorization", "Client-ID e1d1a0b461d74da");
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpURLConnection.connect();
            StringBuilder stringBuilder = new StringBuilder();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream());
            outputStreamWriter.write(URLEncoder.encode("image", "UTF-8") + "=" + URLEncoder.encode(Base64.getEncoder().encodeToString(byteArrayOutputStream.toByteArray()), "UTF-8"));
            outputStreamWriter.flush();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            while ((string = bufferedReader.readLine()) != null) {
                stringBuilder.append(string).append("");
            }
            outputStreamWriter.close();
            bufferedReader.close();
            JsonParser jsonParser = new JsonParser();
            JsonElement jsonElement = jsonParser.parse(stringBuilder.toString());
            String string2 = jsonElement.getAsJsonObject().getAsJsonObject("data").get("link").getAsString();
            StringSelection stringSelection = new StringSelection(string2);
            Minecraft.getMinecraft().addScheduledTask(() -> EventClientScreenShot.Method3714(stringSelection, string2));
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    private static void Method3714(StringSelection stringSelection, String string) {
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, stringSelection);
        Globals.printChatMessage("Image uploaded to:" + string + " link copied to clipboard");
    }
}
