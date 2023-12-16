package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* renamed from: X.2un  reason: invalid class name and case insensitive filesystem */
public class C58152un {
    public static final long A00 = Runtime.getRuntime().maxMemory();
    public static final AnonymousClass5ZC A01 = AnonymousClass0x9.A0T(10, SearchActionVerificationClientService.NOTIFICATION_ID, 100000);
    public static final AnonymousClass5ZC A02 = AnonymousClass0x9.A0T(10, 1000, SearchActionVerificationClientService.NOTIFICATION_ID);
    public static final AnonymousClass5ZC A03 = AnonymousClass0x9.A0T(10, 100, 1000);
    public static final String A04;
    public static final String A05 = AnonymousClass000.A0V("https://play.google.com/apps/testing/", "com.whatsapp", AnonymousClass001.A0o());
    public static final String A06 = String.valueOf(604800);
    public static final String A07;
    public static final String A08 = Character.toString(8239);
    public static final String A09 = Character.toString(160);
    public static final String A0A = AnonymousClass000.A0X("_preferences", AnonymousClass000.A0l("com.whatsapp"));
    public static final String A0B;
    public static final String A0C = AnonymousClass000.A0X(".permission.BROADCAST", AnonymousClass000.A0l("com.whatsapp"));
    public static final Charset A0D;
    public static final Map A0E = new C73313fI();
    public static final byte[] A0F = {6, 0};
    public static final byte[] A0G = {6, 5};
    public static final byte[] A0H = {6, 1};
    public static final byte[] A0I = {6, 6};
    public static final byte[] A0J = {6, 2};
    public static final int[] A0K = {7776000, 604800, 86400, 0};
    public static final int[] A0L = {86400, 604800, 7776000, 0};
    public static final Long[] A0M = new Long[0];
    public static final String[] A0N = new String[0];

    static {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("com.whatsapp");
        A07 = AnonymousClass000.A0X(".fileprovider", A0o);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("android.resource://");
        A0o2.append("com.whatsapp");
        A04 = AnonymousClass000.A0X("/", A0o2);
        Charset charset = StandardCharsets.UTF_8;
        A0D = charset;
        A0B = charset.name();
    }
}
