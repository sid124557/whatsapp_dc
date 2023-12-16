package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.2vR  reason: invalid class name and case insensitive filesystem */
public final class C58552vR {
    public static final List A02 = AnonymousClass8UF.A0o("com.facebook.wakizashi", "com.facebook.katana", "com.facebook.lite", "com.facebook.orca", "com.instagram.android");
    public static final List A03 = AnonymousClass8UF.A0o("facebook", "fb", "fblite", "fb-messenger", "instagram");
    public static final Map A04;
    public final C72173dI A00;
    public final C103335Mm A01;

    static {
        AnonymousClass3Z6[] r3 = new AnonymousClass3Z6[10];
        C142036wX r1 = C142036wX.FACEBOOK;
        AnonymousClass3Z6.A04("facebook", r1, r3);
        AnonymousClass3Z6.A09("fb", r1, r3, 1);
        AnonymousClass3Z6.A09("com.facebook.wakizashi", r1, r3, 2);
        AnonymousClass3Z6.A09("com.facebook.katana", r1, r3, 3);
        C142036wX r12 = C142036wX.FBLITE;
        AnonymousClass3Z6.A08("fblite", r12, r3);
        AnonymousClass3Z6.A09("com.facebook.lite", r12, r3, 5);
        C142036wX r2 = C142036wX.MESSENGER;
        r3[6] = AnonymousClass3Z6.A02("fb-messenger", r2);
        AnonymousClass3Z6.A09("com.facebook.orca", r2, r3, 7);
        C142036wX r22 = C142036wX.INSTAGRAM;
        r3[8] = AnonymousClass3Z6.A02("instagram", r22);
        AnonymousClass3Z6.A09("com.instagram.android", r22, r3, 9);
        A04 = C73813g7.A0F(r3);
    }

    public C58552vR(AnonymousClass4FS r2, C103335Mm r3) {
        C18260x0.A0Q(r2, r3);
        this.A01 = r3;
        this.A00 = C72173dI.A00(r2);
    }
}
