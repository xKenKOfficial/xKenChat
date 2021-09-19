package x.KenKOfficial.Chat.Listeners;

import org.bukkit.event.player.*;
import x.KenKOfficial.Chat.Utils.*;
import org.bukkit.entity.*;
import org.bukkit.event.*;
import java.nio.charset.*;
import java.util.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;

public class PlayerJoin implements Listener
{
    private static final /* synthetic */ String[] IlIl;
    private static final /* synthetic */ int[] llIl;
    
    @EventHandler
    public void onJoin(final PlayerJoinEvent lIIIlIIlIllllll) {
        final Player IIIIlIIlIllllll = lIIIlIIlIllllll.getPlayer();
        if (IlIlIl(IIIIlIIlIllllll.hasPermission(PlayerJoin.IlIl[PlayerJoin.llIl[0]]) ? 1 : 0)) {
            IIIIlIIlIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IlIl[PlayerJoin.llIl[1]]));
            IIIIlIIlIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IlIl[PlayerJoin.llIl[2]]));
            IIIIlIIlIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IlIl[PlayerJoin.llIl[3]]));
            IIIIlIIlIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IlIl[PlayerJoin.llIl[4]]));
            IIIIlIIlIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IlIl[PlayerJoin.llIl[5]]));
            IIIIlIIlIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IlIl[PlayerJoin.llIl[6]]));
            IIIIlIIlIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IlIl[PlayerJoin.llIl[7]]));
            IIIIlIIlIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IlIl[PlayerJoin.llIl[8]]));
            IIIIlIIlIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IlIl[PlayerJoin.llIl[9]]));
            IIIIlIIlIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IlIl[PlayerJoin.llIl[10]]));
            IIIIlIIlIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IlIl[PlayerJoin.llIl[11]]));
        }
    }
    
    private static String IllIIl(String IllllllIIllllll, final String lIlllllIIllllll) {
        IllllllIIllllll = new String(Base64.getDecoder().decode(IllllllIIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lIIIIIIlIllllll = new StringBuilder();
        final char[] IIIIIIIlIllllll = lIlllllIIllllll.toCharArray();
        int lllllllIIllllll = PlayerJoin.llIl[0];
        final long lIIllllIIllllll = (Object)IllllllIIllllll.toCharArray();
        final byte IIIllllIIllllll = (byte)lIIllllIIllllll.length;
        char lllIlllIIllllll = (char)PlayerJoin.llIl[0];
        while (llIlIl(lllIlllIIllllll, IIIllllIIllllll)) {
            final char IIlIIIIlIllllll = lIIllllIIllllll[lllIlllIIllllll];
            lIIIIIIlIllllll.append((char)(IIlIIIIlIllllll ^ IIIIIIIlIllllll[lllllllIIllllll % IIIIIIIlIllllll.length]));
            "".length();
            ++lllllllIIllllll;
            ++lllIlllIIllllll;
            "".length();
            if ((" ".length() & (" ".length() ^ -" ".length())) == "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lIIIIIIlIllllll);
    }
    
    private static boolean IlIlIl(final int IllIlIlIIllllll) {
        return IllIlIlIIllllll != 0;
    }
    
    private static boolean llIlIl(final int lIIllIlIIllllll, final int IIIllIlIIllllll) {
        return lIIllIlIIllllll < IIIllIlIIllllll;
    }
    
    static {
        lIIlIl();
        IIIlIl();
    }
    
    private static void lIIlIl() {
        (llIl = new int[13])[0] = ((0xFC ^ 0x9E) & ~(0x48 ^ 0x2A));
        PlayerJoin.llIl[1] = " ".length();
        PlayerJoin.llIl[2] = "  ".length();
        PlayerJoin.llIl[3] = "   ".length();
        PlayerJoin.llIl[4] = (0x46 ^ 0x66 ^ (0xB9 ^ 0x9D));
        PlayerJoin.llIl[5] = (0xC ^ 0x9);
        PlayerJoin.llIl[6] = (0xA7 ^ 0xA1);
        PlayerJoin.llIl[7] = (0x87 ^ 0x80);
        PlayerJoin.llIl[8] = (0xB1 ^ 0xB9);
        PlayerJoin.llIl[9] = (0x3A ^ 0x33);
        PlayerJoin.llIl[10] = (0x2F ^ 0x25);
        PlayerJoin.llIl[11] = (0x13 ^ 0x5 ^ (0x5A ^ 0x47));
        PlayerJoin.llIl[12] = (0x78 ^ 0x62 ^ (0x69 ^ 0x7F));
    }
    
    private static void IIIlIl() {
        (IlIl = new String[PlayerJoin.llIl[12]])[PlayerJoin.llIl[0]] = lIlIIl("N3D4BBmrgvSOuDI4Y6y5+Q==", "uRUfz");
        PlayerJoin.IlIl[PlayerJoin.llIl[1]] = IllIIl("Q1lHNFxYXFxlXFhcXGU6Q1JHNBkuBA8bCQQVR2BHCTxcZVxYXFxlXFhc", "eaaXa");
        PlayerJoin.IlIl[PlayerJoin.llIl[2]] = IllIIl("", "MJHDg");
        PlayerJoin.IlIl[PlayerJoin.llIl[3]] = lIlIIl("/6vBOn1JqN8MpRo6OZEQr4q80iLlwLJL", "hsTyc");
        PlayerJoin.IlIl[PlayerJoin.llIl[4]] = lIlIIl("T9SsMnwRW8g=", "jICqD");
        PlayerJoin.IlIl[PlayerJoin.llIl[5]] = lllIIl("omnWmZ8qMbTfPWglyl3Ikr2Csds+44amJ4DZCGgtk6E=", "ANdrx");
        PlayerJoin.IlIl[PlayerJoin.llIl[6]] = lIlIIl("YDjY7suu1vI=", "hZXia");
        PlayerJoin.IlIl[PlayerJoin.llIl[7]] = lIlIIl("LM8+00XuDrgsBrlBWeRqCdzU24YzOLnFqEv5lIKRGGCxT/tSGPr2n6gueRnpaHHA", "CgsMj");
        PlayerJoin.IlIl[PlayerJoin.llIl[8]] = lllIIl("FZw2x9MIjlA=", "fxjTZ");
        PlayerJoin.IlIl[PlayerJoin.llIl[9]] = lllIIl("HBSCuAi6FS/hvnm1ilLZKB54N6YxYut2Kx7ZcBrAb+dm/6g2bZZoZoX5KeuzdJMq", "nVZyl");
        PlayerJoin.IlIl[PlayerJoin.llIl[10]] = lIlIIl("XcL0fCnXWlw=", "BoOrf");
        PlayerJoin.IlIl[PlayerJoin.llIl[11]] = IllIIl("cGpILmlrb1N/aWtvU38PcGFILiwdNwABPDcmSHpyOg9Tf2lrb1N/aWtv", "VRnBT");
    }
    
    private static String lllIIl(final String IlllIllIIllllll, final String lIllIllIIllllll) {
        try {
            final SecretKeySpec lIIIlllIIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIllIIllllll.getBytes(StandardCharsets.UTF_8)), PlayerJoin.llIl[8]), "DES");
            final Cipher IIIIlllIIllllll = Cipher.getInstance("DES");
            IIIIlllIIllllll.init(PlayerJoin.llIl[2], lIIIlllIIllllll);
            return new String(IIIIlllIIllllll.doFinal(Base64.getDecoder().decode(IlllIllIIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIllIIllllll) {
            llllIllIIllllll.printStackTrace();
            return null;
        }
    }
    
    private static String lIlIIl(final String lllllIlIIllllll, final String IllllIlIIllllll) {
        try {
            final SecretKeySpec IIlIIllIIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IllllIlIIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llIIIllIIllllll = Cipher.getInstance("Blowfish");
            llIIIllIIllllll.init(PlayerJoin.llIl[2], IIlIIllIIllllll);
            return new String(llIIIllIIllllll.doFinal(Base64.getDecoder().decode(lllllIlIIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlIIIllIIllllll) {
            IlIIIllIIllllll.printStackTrace();
            return null;
        }
    }
}
