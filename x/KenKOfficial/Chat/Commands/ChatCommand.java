package x.KenKOfficial.Chat.Commands;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import org.bukkit.command.*;
import x.KenKOfficial.Chat.Main.*;
import x.KenKOfficial.Chat.Utils.*;
import org.bukkit.*;
import org.bukkit.entity.*;
import java.util.*;

public class ChatCommand implements CommandExecutor
{
    private static final /* synthetic */ String[] IIll;
    private static final /* synthetic */ int[] lIll;
    public static /* synthetic */ boolean muted;
    
    private static void llllIl() {
        (IIll = new String[ChatCommand.lIll[17]])[ChatCommand.lIll[0]] = IIllIl("zabR3ZelKgw=", "rxqGz");
        ChatCommand.IIll[ChatCommand.lIll[1]] = lIllIl("CaIpH9oHnoRWNLXKZ/QiWQ==", "vKcNe");
        ChatCommand.IIll[ChatCommand.lIll[2]] = IlllIl("KzkFIRELIigGBw14NDsVHA==", "hVwSt");
        ChatCommand.IIll[ChatCommand.lIll[3]] = lIllIl("kWtYWX7M++6TMAHd7HSIZQ==", "tdkao");
        ChatCommand.IIll[ChatCommand.lIll[4]] = IlllIl("WQ==", "yWhVT");
        ChatCommand.IIll[ChatCommand.lIll[5]] = IIllIl("D4QryshitAU=", "XdsSj");
        ChatCommand.IIll[ChatCommand.lIll[6]] = lIllIl("A9hzwkw9H0c7g+HooE3VqEM39V3V1PBS", "avvfF");
        ChatCommand.IIll[ChatCommand.lIll[7]] = lIllIl("Cn4PRE0s81E=", "QTRqm");
        ChatCommand.IIll[ChatCommand.lIll[8]] = IIllIl("ktfStp2/Kt6WOtzoHJFMC0V+8JNQ/Nme", "nvtdt");
        ChatCommand.IIll[ChatCommand.lIll[9]] = lIllIl("XhA2QBIHASY=", "ETfGJ");
        ChatCommand.IIll[ChatCommand.lIll[10]] = IlllIl("Ph4=", "Qpzfa");
        ChatCommand.IIll[ChatCommand.lIll[12]] = IlllIl("bQ==", "MtOgC");
        ChatCommand.IIll[ChatCommand.lIll[13]] = IlllIl("TA==", "lKKVS");
        ChatCommand.IIll[ChatCommand.lIll[14]] = IIllIl("ZjgIVuM+QY8=", "QXKiN");
        ChatCommand.IIll[ChatCommand.lIll[15]] = lIllIl("YX8nQMUKdOU=", "IakLQ");
        ChatCommand.IIll[ChatCommand.lIll[16]] = IlllIl("bA==", "LPxcC");
    }
    
    private static String IlllIl(String IIlIlIIIIllllll, final String llIIlIIIIllllll) {
        IIlIlIIIIllllll = new String(Base64.getDecoder().decode(IIlIlIIIIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllIlIIIIllllll = new StringBuilder();
        final char[] IllIlIIIIllllll = llIIlIIIIllllll.toCharArray();
        int lIlIlIIIIllllll = ChatCommand.lIll[0];
        final float llllIIIIIllllll = (Object)IIlIlIIIIllllll.toCharArray();
        final String IlllIIIIIllllll = (String)llllIIIIIllllll.length;
        long lIllIIIIIllllll = ChatCommand.lIll[0];
        while (IlIIll((int)lIllIIIIIllllll, (int)IlllIIIIIllllll)) {
            final char IlIllIIIIllllll = llllIIIIIllllll[lIllIIIIIllllll];
            lllIlIIIIllllll.append((char)(IlIllIIIIllllll ^ IllIlIIIIllllll[lIlIlIIIIllllll % IllIlIIIIllllll.length]));
            "".length();
            ++lIlIlIIIIllllll;
            ++lIllIIIIIllllll;
            "".length();
            if ((0x7F ^ 0x7B) <= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllIlIIIIllllll);
    }
    
    private static boolean IIlIll(final int lIlIlllllIlllll) {
        return lIlIlllllIlllll != 0;
    }
    
    private static boolean lIIIll(final int llIIlllllIlllll) {
        return llIIlllllIlllll == 0;
    }
    
    private static String IIllIl(final String lIIlIlIIIllllll, final String IllIIlIIIllllll) {
        try {
            final SecretKeySpec IIllIlIIIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IllIIlIIIllllll.getBytes(StandardCharsets.UTF_8)), ChatCommand.lIll[8]), "DES");
            final Cipher llIlIlIIIllllll = Cipher.getInstance("DES");
            llIlIlIIIllllll.init(ChatCommand.lIll[2], IIllIlIIIllllll);
            return new String(llIlIlIIIllllll.doFinal(Base64.getDecoder().decode(lIIlIlIIIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlIlIlIIIllllll) {
            IlIlIlIIIllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIIll(final int IIlllllllIlllll, final int llIllllllIlllll) {
        return IIlllllllIlllll == llIllllllIlllll;
    }
    
    private static String lIllIl(final String IIlIIIIIIllllll, final String llIIIIIIIllllll) {
        try {
            final SecretKeySpec lllIIIIIIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIIIIIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IllIIIIIIllllll = Cipher.getInstance("Blowfish");
            IllIIIIIIllllll.init(ChatCommand.lIll[2], lllIIIIIIllllll);
            return new String(IllIIIIIIllllll.doFinal(Base64.getDecoder().decode(IIlIIIIIIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIIIIIIllllll) {
            lIlIIIIIIllllll.printStackTrace();
            return null;
        }
    }
    
    static {
        IIIIll();
        llllIl();
        ChatCommand.muted = (ChatCommand.lIll[0] != 0);
    }
    
    private static boolean IlIIll(final int IIIllllllIlllll, final int lllIlllllIlllll) {
        return IIIllllllIlllll < lllIlllllIlllll;
    }
    
    public boolean onCommand(final CommandSender IlIlllIIIllllll, final Command IlIIIIlIIllllll, final String lIIIIIlIIllllll, final String[] IIIIIIlIIllllll) {
        final String llllllIIIllllll = Main.getPlugin().getConfig().getString(ChatCommand.IIll[ChatCommand.lIll[0]]);
        final String IlllllIIIllllll = Main.getPlugin().getConfig().getString(ChatCommand.IIll[ChatCommand.lIll[1]]);
        final String lIllllIIIllllll = Main.getPlugin().getConfig().getString(ChatCommand.IIll[ChatCommand.lIll[2]]);
        if (lIIIll(IlIlllIIIllllll.hasPermission(ChatCommand.IIll[ChatCommand.lIll[3]]) ? 1 : 0)) {
            IlIlllIIIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(llllllIIIllllll).append(ChatCommand.IIll[ChatCommand.lIll[4]]).append(IlllllIIIllllll))));
            return ChatCommand.lIll[0] != 0;
        }
        if (IlIIll(IIIIIIlIIllllll.length, ChatCommand.lIll[1])) {
            IlIlllIIIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(llllllIIIllllll).append(ChatCommand.IIll[ChatCommand.lIll[5]]).append(lIllllIIIllllll))));
            return ChatCommand.lIll[0] != 0;
        }
        final String IIllllIIIllllll = Main.getPlugin().getConfig().getString(ChatCommand.IIll[ChatCommand.lIll[6]]).replace(ChatCommand.IIll[ChatCommand.lIll[7]], IlIlllIIIllllll.getName());
        final String llIlllIIIllllll = Main.getPlugin().getConfig().getString(ChatCommand.IIll[ChatCommand.lIll[8]]).replace(ChatCommand.IIll[ChatCommand.lIll[9]], IlIlllIIIllllll.getName());
        if (llIIll(IIIIIIlIIllllll.length, ChatCommand.lIll[1])) {
            if (IIlIll(IIIIIIlIIllllll[ChatCommand.lIll[0]].equalsIgnoreCase(ChatCommand.IIll[ChatCommand.lIll[10]]) ? 1 : 0)) {
                ChatCommand.muted = (ChatCommand.lIll[0] != 0);
                final boolean llIIllIIIllllll = (boolean)Bukkit.getOnlinePlayers().iterator();
                while (IIlIll(((Iterator)llIIllIIIllllll).hasNext() ? 1 : 0)) {
                    final Player lllIIIlIIllllll = ((Iterator<Player>)llIIllIIIllllll).next();
                    int IIIlIIlIIllllll = ChatCommand.lIll[0];
                    while (IlIIll(IIIlIIlIIllllll, ChatCommand.lIll[11])) {
                        lllIIIlIIllllll.sendMessage(ChatUtil.fixColor(ChatCommand.IIll[ChatCommand.lIll[12]]));
                        ++IIIlIIlIIllllll;
                        "".length();
                        if ("  ".length() >= (0x71 ^ 0x7B ^ (0x53 ^ 0x5D))) {
                            return ((0xF8 ^ 0xB3 ^ (0xF2 ^ 0x99)) & (17 + 131 - 74 + 95 ^ 134 + 96 - 106 + 13 ^ -" ".length())) != 0x0;
                        }
                    }
                    lllIIIlIIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(llllllIIIllllll).append(ChatCommand.IIll[ChatCommand.lIll[13]]).append(IIllllIIIllllll))));
                    "".length();
                    if ("   ".length() == "  ".length()) {
                        return ((0xA9 ^ 0x82) & ~(0x9B ^ 0xB0)) != 0x0;
                    }
                }
                "".length();
                if (((0x7D ^ 0x27) & ~(0xF8 ^ 0xA2)) != 0x0) {
                    return ((0x19 ^ 0x5F) & ~(0xD4 ^ 0x92)) != 0x0;
                }
            }
            else if (IIlIll(IIIIIIlIIllllll[ChatCommand.lIll[0]].equalsIgnoreCase(ChatCommand.IIll[ChatCommand.lIll[14]]) ? 1 : 0)) {
                ChatCommand.muted = (ChatCommand.lIll[1] != 0);
                final boolean llIIllIIIllllll = (boolean)Bukkit.getOnlinePlayers().iterator();
                while (IIlIll(((Iterator)llIIllIIIllllll).hasNext() ? 1 : 0)) {
                    final Player lIlIIIlIIllllll = ((Iterator<Player>)llIIllIIIllllll).next();
                    int IllIIIlIIllllll = ChatCommand.lIll[0];
                    while (IlIIll(IllIIIlIIllllll, ChatCommand.lIll[11])) {
                        lIlIIIlIIllllll.sendMessage(ChatUtil.fixColor(ChatCommand.IIll[ChatCommand.lIll[15]]));
                        ++IllIIIlIIllllll;
                        "".length();
                        if (-(0x7 ^ 0x2) >= 0) {
                            return ((0x45 ^ 0x4D) & ~(0x87 ^ 0x8F)) != 0x0;
                        }
                    }
                    lIlIIIlIIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(llllllIIIllllll).append(ChatCommand.IIll[ChatCommand.lIll[16]]).append(llIlllIIIllllll))));
                    "".length();
                    if (-" ".length() >= 0) {
                        return ((0x42 ^ 0x7A ^ (0x5C ^ 0x58)) & (41 + 145 - 153 + 123 ^ 11 + 19 - 20 + 150 ^ -" ".length())) != 0x0;
                    }
                }
            }
        }
        return ChatCommand.lIll[0] != 0;
    }
    
    private static void IIIIll() {
        (lIll = new int[18])[0] = ((0x54 ^ 0x18) & ~(0x33 ^ 0x7F));
        ChatCommand.lIll[1] = " ".length();
        ChatCommand.lIll[2] = "  ".length();
        ChatCommand.lIll[3] = "   ".length();
        ChatCommand.lIll[4] = (0xE ^ 0xA);
        ChatCommand.lIll[5] = (0x8A ^ 0xA1 ^ (0x65 ^ 0x4B));
        ChatCommand.lIll[6] = (0x4E ^ 0x48);
        ChatCommand.lIll[7] = (0x8 ^ 0x42 ^ (0xCE ^ 0x83));
        ChatCommand.lIll[8] = (0x2C ^ 0x24);
        ChatCommand.lIll[9] = (0x80 ^ 0x96 ^ (0x1C ^ 0x3));
        ChatCommand.lIll[10] = (0x85 ^ 0x8F);
        ChatCommand.lIll[11] = (0xFFFFDBEC & 0x253F);
        ChatCommand.lIll[12] = (0xB ^ 0x62 ^ (0xD1 ^ 0xB3));
        ChatCommand.lIll[13] = (0x9C ^ 0x81 ^ (0xA6 ^ 0xB7));
        ChatCommand.lIll[14] = (0x15 ^ 0x18);
        ChatCommand.lIll[15] = (0x24 ^ 0x7 ^ (0xBF ^ 0x92));
        ChatCommand.lIll[16] = (0x4D ^ 0x42);
        ChatCommand.lIll[17] = (150 + 108 - 153 + 68 ^ 85 + 36 - 41 + 109);
    }
}
