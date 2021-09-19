package x.KenKOfficial.Chat.Main;

import org.bukkit.plugin.java.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;
import org.bukkit.*;
import org.bukkit.event.*;
import org.bukkit.plugin.*;
import x.KenKOfficial.Chat.Listeners.*;
import org.bukkit.command.*;
import x.KenKOfficial.Chat.Commands.*;

public class Main extends JavaPlugin
{
    private static /* synthetic */ Main plugin;
    private static final /* synthetic */ int[] Il;
    private static final /* synthetic */ String[] I;
    
    public void onEnable() {
        (Main.plugin = this).saveDefaultConfig();
        this.registerCommands();
        this.registerListeners();
        System.out.println(Main.I[Main.Il[0]]);
        System.out.println(Main.I[Main.Il[1]]);
        System.out.println(Main.I[Main.Il[2]]);
        System.out.println(Main.I[Main.Il[3]]);
        System.out.println(Main.I[Main.Il[4]]);
        System.out.println(Main.I[Main.Il[5]]);
    }
    
    private static String l(final String IlIIIIlllllllll, final String lIIIIIlllllllll) {
        try {
            final SecretKeySpec lllIIIlllllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIIIlllllllll.getBytes(StandardCharsets.UTF_8)), Main.Il[8]), "DES");
            final Cipher IllIIIlllllllll = Cipher.getInstance("DES");
            IllIIIlllllllll.init(Main.Il[2], lllIIIlllllllll);
            return new String(IllIIIlllllllll.doFinal(Base64.getDecoder().decode(IlIIIIlllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIIIlllllllll) {
            lIlIIIlllllllll.printStackTrace();
            return null;
        }
    }
    
    private static void IIIl() {
        (Il = new int[17])[0] = ((0x7C ^ 0x7A ^ (0x12 ^ 0x4A)) & (0x12 ^ 0x3D ^ (0x3A ^ 0x4B) ^ -" ".length()));
        Main.Il[1] = " ".length();
        Main.Il[2] = "  ".length();
        Main.Il[3] = "   ".length();
        Main.Il[4] = (0xA7 ^ 0x84 ^ (0x42 ^ 0x65));
        Main.Il[5] = (0x99 ^ 0x9C);
        Main.Il[6] = (0x15 ^ 0x13);
        Main.Il[7] = (148 + 145 - 133 + 13 ^ 17 + 164 - 131 + 120);
        Main.Il[8] = (0x20 ^ 0x28);
        Main.Il[9] = (0x7A ^ 0x73);
        Main.Il[10] = (0x52 ^ 0x36 ^ (0x3B ^ 0x55));
        Main.Il[11] = (0xB1 ^ 0xBA);
        Main.Il[12] = (0x91 ^ 0x9D);
        Main.Il[13] = (0xB8 ^ 0xB5);
        Main.Il[14] = (36 + 107 - 73 + 70 ^ 117 + 116 - 121 + 18);
        Main.Il[15] = (0xA9 ^ 0xA6);
        Main.Il[16] = (0x3F ^ 0x2F);
    }
    
    static {
        IIIl();
        lll();
    }
    
    public static Main getPlugin() {
        return Main.plugin;
    }
    
    private static boolean lIIl(final int IIllllIllllllll, final int llIlllIllllllll) {
        return IIllllIllllllll < llIlllIllllllll;
    }
    
    private static void lll() {
        (I = new String[Main.Il[16]])[Main.Il[0]] = I("LIvZ/STMhmksi9n9JMyGaSyL2f0kzIZpLIvZ/STMhmksi9n9JMyGaSyL2f0kzIZpLIvZ/STMhmm/kKGaWObtbg==", "YfKsk");
        Main.I[Main.Il[1]] = l("ikwqPNwFV1Me4a78oXKBrA==", "DCPsi");
        Main.I[Main.Il[2]] = Il("EyogJDwqIWh3ZGt/fxUwMS4=", "EORWU");
        Main.I[Main.Il[3]] = Il("IxslIB0DDDQtSg==", "bxQIk");
        Main.I[Main.Il[4]] = I("561OvPUzMKAVra+FNLmADK6XIQ2PjcRvPrWV9nwRwRBQ+m1mmEOulhMzOXaTG8w+lGMljVCT/2Y=", "tqxHK");
        Main.I[Main.Il[5]] = I("tiJEcsli8IS2IkRyyWLwhLYiRHLJYvCEtiJEcsli8IS2IkRyyWLwhLYiRHLJYvCEtiJEcsli8IQlK615HP4b+Q==", "GUVwh");
        Main.I[Main.Il[6]] = I("u/by2uHmrtu79vLa4eau27v28trh5q7bu/by2uHmrtu79vLa4eau27v28trh5q7bu/by2uHmrtvok3PU7HEF0A==", "OPZdd");
        Main.I[Main.Il[7]] = Il("CAE/FjAYKy4=", "pJZxs");
        Main.I[Main.Il[8]] = Il("AwoQKhE6AVh5SXtfTxsdIQ4=", "UobYx");
        Main.I[Main.Il[9]] = I("Y/MHeXlWEqU=", "VxHGx");
        Main.I[Main.Il[10]] = I("tYw71RnggYVKbmd0KOSK44zcEVJnuzpvArlmZO1PRHolAoWZDgzOsiUZOkAcKu4jNEEqThl6BkY=", "QFpCc");
        Main.I[Main.Il[11]] = Il("U3V5aU9TdXlpT1N1eWlPU3V5aU9TdXlpT1N1eWlPU3V5aU9TdXlpT1N1eWlPU3V5aU9TdXlpT1N1eWk=", "pVZJl");
        Main.I[Main.Il[12]] = I("u6GR6sBEf/vI0tjd+LB2/aMbZ4H3XNXhlXP1ChrflDLXNE1Y5/rA16QysutDVr9R", "IQXTO");
        Main.I[Main.Il[13]] = I("6+Jm6Q8I0y7qEJh1kTHOPg==", "CPwYs");
        Main.I[Main.Il[14]] = Il("JysHBw==", "DCfsW");
        Main.I[Main.Il[15]] = l("8CZS658VZrU92XCCHiTn/V2frLVyOSXXl2KQvUUbGgRhDNq0dFNAxA==", "zfhUw");
    }
    
    public void registerListeners() {
        this.getLogger().info(Main.I[Main.Il[15]]);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new ChatListener(), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener)new PlayerJoin(), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener)new PlayerChat(), (Plugin)this);
    }
    
    public void registerCommands() {
        this.getLogger().info(Main.I[Main.Il[12]]);
        this.getCommand(Main.I[Main.Il[13]]).setExecutor((CommandExecutor)new ChatClearCommand());
        this.getCommand(Main.I[Main.Il[14]]).setExecutor((CommandExecutor)new ChatCommand());
    }
    
    private static String I(final String llllIIlllllllll, final String IlllIIlllllllll) {
        try {
            final SecretKeySpec IIlIlIlllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IlllIIlllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llIIlIlllllllll = Cipher.getInstance("Blowfish");
            llIIlIlllllllll.init(Main.Il[2], IIlIlIlllllllll);
            return new String(llIIlIlllllllll.doFinal(Base64.getDecoder().decode(llllIIlllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlIIlIlllllllll) {
            IlIIlIlllllllll.printStackTrace();
            return null;
        }
    }
    
    public void onDisable() {
        this.saveDefaultConfig();
        System.out.println(Main.I[Main.Il[6]]);
        System.out.println(Main.I[Main.Il[7]]);
        System.out.println(Main.I[Main.Il[8]]);
        System.out.println(Main.I[Main.Il[9]]);
        System.out.println(Main.I[Main.Il[10]]);
        System.out.println(Main.I[Main.Il[11]]);
    }
    
    private static String Il(String lIIIIllllllllll, final String IIIIIllllllllll) {
        lIIIIllllllllll = new String(Base64.getDecoder().decode(lIIIIllllllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IIlIIllllllllll = new StringBuilder();
        final char[] llIIIllllllllll = IIIIIllllllllll.toCharArray();
        int IlIIIllllllllll = Main.Il[0];
        final short IIlllIlllllllll = (Object)lIIIIllllllllll.toCharArray();
        final boolean llIllIlllllllll = IIlllIlllllllll.length != 0;
        long IlIllIlllllllll = Main.Il[0];
        while (lIIl((int)IlIllIlllllllll, llIllIlllllllll ? 1 : 0)) {
            final char lllIIllllllllll = IIlllIlllllllll[IlIllIlllllllll];
            IIlIIllllllllll.append((char)(lllIIllllllllll ^ llIIIllllllllll[IlIIIllllllllll % llIIIllllllllll.length]));
            "".length();
            ++IlIIIllllllllll;
            ++IlIllIlllllllll;
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(IIlIIllllllllll);
    }
}
