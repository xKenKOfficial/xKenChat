package x.KenKOfficial.Chat.Listeners;

import x.KenKOfficial.Chat.Commands.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;
import org.bukkit.event.player.*;
import x.KenKOfficial.Chat.Main.*;
import x.KenKOfficial.Chat.Utils.*;
import org.bukkit.entity.*;
import org.bukkit.event.*;

public class ChatListener extends ChatCommand implements Listener
{
    private static final /* synthetic */ String[] IIIl;
    private static final /* synthetic */ int[] lIIl;
    
    private static String lllll(final String lIllllIlIllllll, final String IIllllIlIllllll) {
        try {
            final SecretKeySpec IlIIIIllIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IIllllIlIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lIIIIIllIllllll = Cipher.getInstance("Blowfish");
            lIIIIIllIllllll.init(ChatListener.lIIl[2], IlIIIIllIllllll);
            return new String(lIIIIIllIllllll.doFinal(Base64.getDecoder().decode(lIllllIlIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIIIIIllIllllll) {
            IIIIIIllIllllll.printStackTrace();
            return null;
        }
    }
    
    private static void IIIIIl() {
        (IIIl = new String[ChatListener.lIIl[4]])[ChatListener.lIIl[0]] = Illll("KQM5PEEnDis7Di0OdioDJQgzLQs=", "JkXHo");
        ChatListener.IIIl[ChatListener.lIIl[1]] = lllll("g+Z84ewWXUc=", "DYBjW");
        ChatListener.IIIl[ChatListener.lIIl[2]] = Illll("ICckJwUwLTVnBzwhKCc=", "XLAIf");
        ChatListener.IIIl[ChatListener.lIIl[3]] = Illll("Yw==", "ClIrl");
    }
    
    static {
        lIIIIl();
        IIIIIl();
    }
    
    private static boolean IlIIIl(final int IIlllIIlIllllll) {
        return IIlllIIlIllllll == 0;
    }
    
    private static boolean llIIIl(final int lIIllIIlIllllll, final int IIIllIIlIllllll) {
        return lIIllIIlIllllll != IIIllIIlIllllll;
    }
    
    private static boolean IIlIIl(final int lllllIIlIllllll, final int IllllIIlIllllll) {
        return lllllIIlIllllll < IllllIIlIllllll;
    }
    
    @EventHandler
    public void onChat(final PlayerChatEvent IlIlIIllIllllll) {
        final Player lIllIIllIllllll = IlIlIIllIllllll.getPlayer();
        final String IIllIIllIllllll = Main.getPlugin().getConfig().getString(ChatListener.IIIl[ChatListener.lIIl[0]]);
        final String llIlIIllIllllll = Main.getPlugin().getConfig().getString(ChatListener.IIIl[ChatListener.lIIl[1]]);
        int liIllIIlIllllll;
        if (IlIIIl(ChatCommand.muted ? 1 : 0)) {
            liIllIIlIllllll = ChatListener.lIIl[1];
            "".length();
            if ("   ".length() >= ("   ".length() ^ (0x67 ^ 0x60))) {
                return;
            }
        }
        else {
            liIllIIlIllllll = ChatListener.lIIl[0];
        }
        if (llIIIl(liIllIIlIllllll, ChatListener.lIIl[1]) && IlIIIl(lIllIIllIllllll.hasPermission(ChatListener.IIIl[ChatListener.lIIl[2]]) ? 1 : 0)) {
            IlIlIIllIllllll.setCancelled((boolean)(ChatListener.lIIl[1] != 0));
            lIllIIllIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(llIlIIllIllllll).append(ChatListener.IIIl[ChatListener.lIIl[3]]).append(IIllIIllIllllll))));
        }
    }
    
    private static String Illll(String IlIlIlIlIllllll, final String lIIlIlIlIllllll) {
        IlIlIlIlIllllll = (char)new String(Base64.getDecoder().decode(((String)IlIlIlIlIllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lIllIlIlIllllll = new StringBuilder();
        final char[] IIllIlIlIllllll = lIIlIlIlIllllll.toCharArray();
        int llIlIlIlIllllll = ChatListener.lIIl[0];
        final long lIlIIlIlIllllll = (Object)((String)IlIlIlIlIllllll).toCharArray();
        final double IIlIIlIlIllllll = lIlIIlIlIllllll.length;
        byte llIIIlIlIllllll = (byte)ChatListener.lIIl[0];
        while (IIlIIl(llIIIlIlIllllll, (int)IIlIIlIlIllllll)) {
            final char IIIIllIlIllllll = lIlIIlIlIllllll[llIIIlIlIllllll];
            lIllIlIlIllllll.append((char)(IIIIllIlIllllll ^ IIllIlIlIllllll[llIlIlIlIllllll % IIllIlIlIllllll.length]));
            "".length();
            ++llIlIlIlIllllll;
            ++llIIIlIlIllllll;
            "".length();
            if ((0x88 ^ 0x8C) == 0x0) {
                return null;
            }
        }
        return String.valueOf(lIllIlIlIllllll);
    }
    
    private static void lIIIIl() {
        (lIIl = new int[5])[0] = ((0xF2 ^ 0xA9) & ~(0x55 ^ 0xE) & ~((0x75 ^ 0x4B) & ~(0xAA ^ 0x94)));
        ChatListener.lIIl[1] = " ".length();
        ChatListener.lIIl[2] = "  ".length();
        ChatListener.lIIl[3] = "   ".length();
        ChatListener.lIIl[4] = (0x66 ^ 0x62);
    }
}
