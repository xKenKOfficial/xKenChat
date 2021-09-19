package x.KenKOfficial.Chat.Utils;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class ChatUtil
{
    private static final /* synthetic */ int[] lll;
    private static final /* synthetic */ String[] Ill;
    
    private static boolean lIlll(final int IIIllIllIllllll, final int lllIlIllIllllll) {
        return IIIllIllIllllll < lllIlIllIllllll;
    }
    
    static {
        IIlll();
        llIll();
    }
    
    private static String IlIll(final String IllllIllIllllll, final String lIlllIllIllllll) {
        try {
            final SecretKeySpec llIIIlllIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlllIllIllllll.getBytes(StandardCharsets.UTF_8)), ChatUtil.lll[8]), "DES");
            final Cipher IlIIIlllIllllll = Cipher.getInstance("DES");
            IlIIIlllIllllll.init(ChatUtil.lll[2], llIIIlllIllllll);
            return new String(IlIIIlllIllllll.doFinal(Base64.getDecoder().decode(IllllIllIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIIlllIllllll) {
            lIIIIlllIllllll.printStackTrace();
            return null;
        }
    }
    
    private static String IIIll(final String llIlIlllIllllll, final String IlIlIlllIllllll) {
        try {
            final SecretKeySpec IIIIllllIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IlIlIlllIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllIlllIllllll = Cipher.getInstance("Blowfish");
            llllIlllIllllll.init(ChatUtil.lll[2], IIIIllllIllllll);
            return new String(llllIlllIllllll.doFinal(Base64.getDecoder().decode(llIlIlllIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlllIlllIllllll) {
            IlllIlllIllllll.printStackTrace();
            return null;
        }
    }
    
    private static String lIIll(String lIllllllIllllll, final String lIIIIIIIlllllll) {
        lIllllllIllllll = new String(Base64.getDecoder().decode(lIllllllIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IIIIIIIIlllllll = new StringBuilder();
        final char[] llllllllIllllll = lIIIIIIIlllllll.toCharArray();
        int IlllllllIllllll = ChatUtil.lll[0];
        final double IIIlllllIllllll = (Object)lIllllllIllllll.toCharArray();
        final char lllIllllIllllll = (char)IIIlllllIllllll.length;
        short IllIllllIllllll = (short)ChatUtil.lll[0];
        while (lIlll(IllIllllIllllll, lllIllllIllllll)) {
            final char llIIIIIIlllllll = IIIlllllIllllll[IllIllllIllllll];
            IIIIIIIIlllllll.append((char)(llIIIIIIlllllll ^ llllllllIllllll[IlllllllIllllll % llllllllIllllll.length]));
            "".length();
            ++IlllllllIllllll;
            ++IllIllllIllllll;
            "".length();
            if (((0x54 ^ 0x45) & ~(0xD3 ^ 0xC2)) != 0x0) {
                return null;
            }
        }
        return String.valueOf(IIIIIIIIlllllll);
    }
    
    private static void llIll() {
        (Ill = new String[ChatUtil.lll[8]])[ChatUtil.lll[0]] = IIIll("Bell3eRyo8w=", "RAsac");
        ChatUtil.Ill[ChatUtil.lll[1]] = lIIll("w6w=", "KfZMk");
        ChatUtil.Ill[ChatUtil.lll[2]] = IIIll("H+zULQJmyKY=", "mRxiL");
        ChatUtil.Ill[ChatUtil.lll[3]] = IIIll("Xqc4fMRziaw=", "LwBIc");
        ChatUtil.Ill[ChatUtil.lll[4]] = IIIll("9GxQB1qZtF4=", "TtnpS");
        ChatUtil.Ill[ChatUtil.lll[5]] = IlIll("n/VFSMUfjoA=", "BLpFt");
        ChatUtil.Ill[ChatUtil.lll[6]] = IlIll("PSVr8LQV+o0=", "QPObI");
        ChatUtil.Ill[ChatUtil.lll[7]] = IIIll("VKVZMh1Xin4=", "Pvdqj");
    }
    
    private static void IIlll() {
        (lll = new int[9])[0] = ((0x11 ^ 0x57) & ~(0xD8 ^ 0x9E));
        ChatUtil.lll[1] = " ".length();
        ChatUtil.lll[2] = "  ".length();
        ChatUtil.lll[3] = "   ".length();
        ChatUtil.lll[4] = (0x4B ^ 0xE ^ (0xF0 ^ 0xB1));
        ChatUtil.lll[5] = (0x66 ^ 0x6E ^ (0xAF ^ 0xA2));
        ChatUtil.lll[6] = (0xBC ^ 0xBA);
        ChatUtil.lll[7] = (23 + 46 - 65 + 163 ^ 106 + 123 - 70 + 1);
        ChatUtil.lll[8] = (0x66 ^ 0x73 ^ (0x12 ^ 0xF));
    }
    
    public static String fixColor(final String IlllIIIIlllllll) {
        return IlllIIIIlllllll.replaceAll(ChatUtil.Ill[ChatUtil.lll[0]], ChatUtil.Ill[ChatUtil.lll[1]]).replace(ChatUtil.Ill[ChatUtil.lll[2]], ChatUtil.Ill[ChatUtil.lll[3]]).replace(ChatUtil.Ill[ChatUtil.lll[4]], ChatUtil.Ill[ChatUtil.lll[5]]).replace(ChatUtil.Ill[ChatUtil.lll[6]], ChatUtil.Ill[ChatUtil.lll[7]]);
    }
}
