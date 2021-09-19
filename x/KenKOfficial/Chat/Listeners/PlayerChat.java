package x.KenKOfficial.Chat.Listeners;

import org.bukkit.entity.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import org.bukkit.event.player.*;
import x.KenKOfficial.Chat.Main.*;
import x.KenKOfficial.Chat.Utils.*;
import org.bukkit.event.*;
import java.util.*;

public class PlayerChat implements Listener
{
    private static final /* synthetic */ int[] lIl;
    private static final /* synthetic */ String[] IIl;
    static /* synthetic */ HashMap<Player, Long> czas;
    
    private static boolean lIlIl(final int lIlIlIIIlllllll) {
        return lIlIlIIIlllllll == 0;
    }
    
    private static void IlIIl() {
        (lIl = new int[8])[0] = ((0x27 ^ 0xB) & ~(0x95 ^ 0xB9));
        PlayerChat.lIl[1] = " ".length();
        PlayerChat.lIl[2] = "  ".length();
        PlayerChat.lIl[3] = "   ".length();
        PlayerChat.lIl[4] = (0x3F ^ 0x4C ^ (0x6C ^ 0x1B));
        PlayerChat.lIl[5] = (135 + 79 - 112 + 35 ^ 8 + 64 - 16 + 84);
        PlayerChat.lIl[6] = (133 + 92 - 40 + 6 ^ 171 + 74 - 134 + 74);
        PlayerChat.lIl[7] = (0x77 ^ 0x46 ^ (0xB0 ^ 0x89));
    }
    
    private static String Illl(final String lIlIIIlIlllllll, final String IIlIIIlIlllllll) {
        try {
            final SecretKeySpec IlIlIIlIlllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IIlIIIlIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lIIlIIlIlllllll = Cipher.getInstance("Blowfish");
            lIIlIIlIlllllll.init(PlayerChat.lIl[2], IlIlIIlIlllllll);
            return new String(lIIlIIlIlllllll.doFinal(Base64.getDecoder().decode(lIlIIIlIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIIlIIlIlllllll) {
            IIIlIIlIlllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean IIlIl(final int lllIlIIIlllllll) {
        return lllIlIIIlllllll != 0;
    }
    
    static {
        IlIIl();
        lIIIl();
        PlayerChat.czas = new HashMap<Player, Long>();
    }
    
    private static String IIIIl(String IlIIllIIlllllll, final String IllIllIIlllllll) {
        IlIIllIIlllllll = (char)new String(Base64.getDecoder().decode(((String)IlIIllIIlllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lIlIllIIlllllll = new StringBuilder();
        final char[] IIlIllIIlllllll = IllIllIIlllllll.toCharArray();
        int llIIllIIlllllll = PlayerChat.lIl[0];
        final float lIllIlIIlllllll = (Object)((String)IlIIllIIlllllll).toCharArray();
        final short IIllIlIIlllllll = (short)lIllIlIIlllllll.length;
        byte llIlIlIIlllllll = (byte)PlayerChat.lIl[0];
        while (lllIl(llIlIlIIlllllll, IIllIlIIlllllll)) {
            final char IIIlllIIlllllll = lIllIlIIlllllll[llIlIlIIlllllll];
            lIlIllIIlllllll.append((char)(IIIlllIIlllllll ^ IIlIllIIlllllll[llIIllIIlllllll % IIlIllIIlllllll.length]));
            "".length();
            ++llIIllIIlllllll;
            ++llIlIlIIlllllll;
            "".length();
            if ("  ".length() < ((0x58 ^ 0x0) & ~(0x6E ^ 0x36))) {
                return null;
            }
        }
        return String.valueOf(lIlIllIIlllllll);
    }
    
    private static boolean IllIl(final int llIIlIIIlllllll) {
        return llIIlIIIlllllll > 0;
    }
    
    @EventHandler
    public void onChat(final PlayerChatEvent IlIIlIlIlllllll) {
        final Player lIlIlIlIlllllll = IlIIlIlIlllllll.getPlayer();
        final String IIlIlIlIlllllll = Main.getPlugin().getConfig().getString(PlayerChat.IIl[PlayerChat.lIl[0]]);
        final String llIIlIlIlllllll = Main.getPlugin().getConfig().getString(PlayerChat.IIl[PlayerChat.lIl[1]]);
        if (!IIlIl(lIlIlIlIlllllll.isOp() ? 1 : 0) || lIlIl(lIlIlIlIlllllll.hasPermission(PlayerChat.IIl[PlayerChat.lIl[2]]) ? 1 : 0)) {
            if (IIlIl(PlayerChat.czas.containsKey(lIlIlIlIlllllll) ? 1 : 0)) {
                if (IllIl(llIIl(PlayerChat.czas.get(lIlIlIlIlllllll), System.currentTimeMillis()))) {
                    lIlIlIlIlllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(IIlIlIlIlllllll).append(PlayerChat.IIl[PlayerChat.lIl[3]]).append(llIIlIlIlllllll))));
                    IlIIlIlIlllllll.setCancelled((boolean)(PlayerChat.lIl[1] != 0));
                    "".length();
                    if (" ".length() <= 0) {
                        return;
                    }
                }
                else {
                    PlayerChat.czas.put(lIlIlIlIlllllll, System.currentTimeMillis() + Main.getPlugin().getConfig().getInt(PlayerChat.IIl[PlayerChat.lIl[4]]));
                    "".length();
                    "".length();
                    if (" ".length() > " ".length()) {
                        return;
                    }
                }
            }
            else {
                PlayerChat.czas.put(lIlIlIlIlllllll, System.currentTimeMillis() + Main.getPlugin().getConfig().getInt(PlayerChat.IIl[PlayerChat.lIl[5]]));
                "".length();
            }
        }
    }
    
    private static void lIIIl() {
        (IIl = new String[PlayerChat.lIl[6]])[PlayerChat.lIl[0]] = Illl("8Q5CzwUc2iI=", "FqdtA");
        PlayerChat.IIl[PlayerChat.lIl[1]] = Illl("uFusUmYfIypgMbKqU7LZEJD1o7CPKYqRGaeMZsSDw+Xmi3L0DqNWlA==", "sseKI");
        PlayerChat.IIl[PlayerChat.lIl[2]] = llll("gPqIght+3IEvrEpbY8yB08BMB5M50whg", "kQSqr");
        PlayerChat.IIl[PlayerChat.lIl[3]] = IIIIl("WQ==", "yHMdp");
        PlayerChat.IIl[PlayerChat.lIl[4]] = llll("vtrOAjcUQQAWiCFd2jW4kw==", "xSSwB");
        PlayerChat.IIl[PlayerChat.lIl[5]] = llll("zigHRAvRaYixHGrUUU8SXA==", "STHQy");
    }
    
    private static boolean lllIl(final int IlIllIIIlllllll, final int lIIllIIIlllllll) {
        return IlIllIIIlllllll < lIIllIIIlllllll;
    }
    
    private static int llIIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static String llll(final String IlIIIlIIlllllll, final String lIIIIlIIlllllll) {
        try {
            final SecretKeySpec lIlIIlIIlllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIIlIIlllllll.getBytes(StandardCharsets.UTF_8)), PlayerChat.lIl[7]), "DES");
            final Cipher IIlIIlIIlllllll = Cipher.getInstance("DES");
            IIlIIlIIlllllll.init(PlayerChat.lIl[2], lIlIIlIIlllllll);
            return new String(IIlIIlIIlllllll.doFinal(Base64.getDecoder().decode(IlIIIlIIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIIlIIlllllll) {
            llIIIlIIlllllll.printStackTrace();
            return null;
        }
    }
}
