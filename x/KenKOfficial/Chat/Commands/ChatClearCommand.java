package x.KenKOfficial.Chat.Commands;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import org.bukkit.command.*;
import x.KenKOfficial.Chat.Main.*;
import x.KenKOfficial.Chat.Utils.*;
import org.bukkit.entity.*;
import org.bukkit.*;
import java.util.*;

public class ChatClearCommand implements CommandExecutor
{
    private static final /* synthetic */ int[] ll;
    private static final /* synthetic */ String[] l;
    
    private static boolean lIll(final int lIIIIllIlllllll) {
        return lIIIIllIlllllll != 0;
    }
    
    private static boolean llIl(final int lllllIlIlllllll) {
        return lllllIlIlllllll == 0;
    }
    
    static {
        IlIl();
        Ill();
    }
    
    private static boolean IIll(final int IIlIIllIlllllll, final int llIIIllIlllllll) {
        return IIlIIllIlllllll < llIIIllIlllllll;
    }
    
    private static void IlIl() {
        (ll = new int[12])[0] = ((0xDD ^ 0x85) & ~(0x2C ^ 0x74));
        ChatClearCommand.ll[1] = " ".length();
        ChatClearCommand.ll[2] = "  ".length();
        ChatClearCommand.ll[3] = "   ".length();
        ChatClearCommand.ll[4] = (0xA3 ^ 0xA7);
        ChatClearCommand.ll[5] = (161 + 151 - 126 + 10 ^ 152 + 187 - 185 + 39);
        ChatClearCommand.ll[6] = (-(0xFFFFBFED & 0x5417) & (0xFFFF9FF4 & 0x759F));
        ChatClearCommand.ll[7] = (0x9D ^ 0x9B);
        ChatClearCommand.ll[8] = (0xDD ^ 0x93 ^ (0x79 ^ 0x30));
        ChatClearCommand.ll[9] = (0x31 ^ 0x27 ^ (0x6A ^ 0x74));
        ChatClearCommand.ll[10] = (0xAB ^ 0xA2);
        ChatClearCommand.ll[11] = (28 + 135 - 110 + 130 ^ 152 + 7 - 26 + 56);
    }
    
    private static String IIl(final String IIlIIIIllllllll, final String llIIIIIllllllll) {
        try {
            final SecretKeySpec lllIIIIllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIIIllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IllIIIIllllllll = Cipher.getInstance("Blowfish");
            IllIIIIllllllll.init(ChatClearCommand.ll[2], lllIIIIllllllll);
            return new String(IllIIIIllllllll.doFinal(Base64.getDecoder().decode(IIlIIIIllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIIIIllllllll) {
            lIlIIIIllllllll.printStackTrace();
            return null;
        }
    }
    
    private static void Ill() {
        (l = new String[ChatClearCommand.ll[11]])[ChatClearCommand.ll[0]] = ll("EhQ0EyQa", "bfQuM");
        ChatClearCommand.l[ChatClearCommand.ll[1]] = ll("FhsWGCoKGSAbPBEbJxs=", "xtIhO");
        ChatClearCommand.l[ChatClearCommand.ll[2]] = IIl("Q+wu0Fk32eNtq4X4FG5epijpMiwH3XJc", "QpWIM");
        ChatClearCommand.l[ChatClearCommand.ll[3]] = ll("Vw==", "wAxfQ");
        ChatClearCommand.l[ChatClearCommand.ll[4]] = ll("IC8gGAgKLw==", "mJSki");
        ChatClearCommand.l[ChatClearCommand.ll[5]] = IIl("w9xICipqllQ=", "ASDcz");
        ChatClearCommand.l[ChatClearCommand.ll[7]] = IIl("r75abYku5V4=", "PpJKO");
        ChatClearCommand.l[ChatClearCommand.ll[8]] = lIl("P9VUrF5N9wI=", "vtuEB");
        ChatClearCommand.l[ChatClearCommand.ll[9]] = ll("JC4xFDMOLh0mNgQiLA==", "iKBgR");
        ChatClearCommand.l[ChatClearCommand.ll[10]] = ll("RA==", "dyMME");
    }
    
    private static String ll(String llllIllIlllllll, final String llIIlllIlllllll) {
        llllIllIlllllll = (char)new String(Base64.getDecoder().decode(((String)llllIllIlllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IlIIlllIlllllll = new StringBuilder();
        final char[] lIIIlllIlllllll = llIIlllIlllllll.toCharArray();
        int IIIIlllIlllllll = ChatClearCommand.ll[0];
        final int IlIlIllIlllllll = (Object)((String)llllIllIlllllll).toCharArray();
        final Exception lIIlIllIlllllll = (Exception)IlIlIllIlllllll.length;
        int IIIlIllIlllllll = ChatClearCommand.ll[0];
        while (IIll(IIIlIllIlllllll, (int)lIIlIllIlllllll)) {
            final char lIlIlllIlllllll = IlIlIllIlllllll[IIIlIllIlllllll];
            IlIIlllIlllllll.append((char)(lIlIlllIlllllll ^ lIIIlllIlllllll[IIIIlllIlllllll % lIIIlllIlllllll.length]));
            "".length();
            ++IIIIlllIlllllll;
            ++IIIlIllIlllllll;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(IlIIlllIlllllll);
    }
    
    private static String lIl(final String lIIIlIIllllllll, final String IIIIlIIllllllll) {
        try {
            final SecretKeySpec IIlIlIIllllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IIIIlIIllllllll.getBytes(StandardCharsets.UTF_8)), ChatClearCommand.ll[9]), "DES");
            final Cipher llIIlIIllllllll = Cipher.getInstance("DES");
            llIIlIIllllllll.init(ChatClearCommand.ll[2], IIlIlIIllllllll);
            return new String(llIIlIIllllllll.doFinal(Base64.getDecoder().decode(lIIIlIIllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlIIlIIllllllll) {
            IlIIlIIllllllll.printStackTrace();
            return null;
        }
    }
    
    public boolean onCommand(final CommandSender IIIlIlIllllllll, final Command lllIIlIllllllll, final String IllIIlIllllllll, final String[] IIIIIlIllllllll) {
        final String IIlIIlIllllllll = Main.getPlugin().getConfig().getString(ChatClearCommand.l[ChatClearCommand.ll[0]]);
        final String llIIIlIllllllll = Main.getPlugin().getConfig().getString(ChatClearCommand.l[ChatClearCommand.ll[1]]);
        if (llIl(IIIlIlIllllllll.hasPermission(ChatClearCommand.l[ChatClearCommand.ll[2]]) ? 1 : 0)) {
            IIIlIlIllllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(IIlIIlIllllllll).append(ChatClearCommand.l[ChatClearCommand.ll[3]]).append(llIIIlIllllllll))));
            return ChatClearCommand.ll[0] != 0;
        }
        final Player IlIIIlIllllllll = (Player)IIIlIlIllllllll;
        if (IIll(IIIIIlIllllllll.length, ChatClearCommand.ll[1])) {
            final String llIlIlIllllllll = Main.getPlugin().getConfig().getString(ChatClearCommand.l[ChatClearCommand.ll[4]]).replace(ChatClearCommand.l[ChatClearCommand.ll[5]], IlIIIlIllllllll.getName());
            int lIllIlIllllllll = ChatClearCommand.ll[0];
            while (IIll(lIllIlIllllllll, ChatClearCommand.ll[6])) {
                final short IlIllIIllllllll = (short)Bukkit.getOnlinePlayers().iterator();
                while (lIll(((Iterator)IlIllIIllllllll).hasNext() ? 1 : 0)) {
                    final Player IlllIlIllllllll = ((Iterator<Player>)IlIllIIllllllll).next();
                    IlllIlIllllllll.sendMessage(ChatClearCommand.l[ChatClearCommand.ll[7]]);
                    "".length();
                    if (-(0x10 ^ 0x49 ^ (0x79 ^ 0x24)) > 0) {
                        return ((111 + 53 - 154 + 174 ^ 44 + 35 - 72 + 131) & (0x84 ^ 0x94 ^ (0x35 ^ 0x17) ^ -" ".length())) != 0x0;
                    }
                }
                ++lIllIlIllllllll;
                "".length();
                if ("  ".length() < 0) {
                    return ((0x42 ^ 0x6C) & ~(0xA9 ^ 0x87)) != 0x0;
                }
            }
            final Iterator<Player> iterator = (Iterator<Player>)Bukkit.getOnlinePlayers().iterator();
            while (lIll(iterator.hasNext() ? 1 : 0)) {
                final Player IIllIlIllllllll = iterator.next();
                IIllIlIllllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(IIlIIlIllllllll).append(ChatClearCommand.l[ChatClearCommand.ll[8]]).append(llIlIlIllllllll))));
                "".length();
                if (-(((0x30 ^ 0x74) & ~(0xDB ^ 0x9F)) ^ (0x7D ^ 0x78)) >= 0) {
                    return ((0x70 ^ 0x7C ^ (0x13 ^ 0x2)) & (0x75 ^ 0x6C ^ (0x87 ^ 0x83) ^ -" ".length())) != 0x0;
                }
            }
            final String IlIlIlIllllllll = Main.getPlugin().getConfig().getString(ChatClearCommand.l[ChatClearCommand.ll[9]]);
            IlIIIlIllllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(IIlIIlIllllllll).append(ChatClearCommand.l[ChatClearCommand.ll[10]]).append(IlIlIlIllllllll))));
        }
        return ChatClearCommand.ll[0] != 0;
    }
}
