package X;

import java.util.Arrays;

/* renamed from: X.7no  reason: invalid class name and case insensitive filesystem */
public final class C160527no {
    public static final C160527no A02;
    public static final C160527no A03 = new C160527no(new int[]{2, 5, 6}, 8);
    public final int A00;
    public final int[] A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C160527no)) {
            return false;
        }
        C160527no r4 = (C160527no) obj;
        return Arrays.equals(this.A01, r4.A01) && this.A00 == r4.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if ("Xiaomi".equals(r1) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C160527no A00(android.content.Context r4) {
        /*
            java.lang.String r0 = "android.media.action.HDMI_AUDIO_PLUG"
            android.content.IntentFilter r1 = new android.content.IntentFilter
            r1.<init>(r0)
            r0 = 0
            android.content.Intent r3 = r4.registerReceiver(r0, r1)
            java.lang.String r1 = X.C162387ry.A04
            java.lang.String r0 = "Amazon"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x001f
            java.lang.String r0 = "Xiaomi"
            boolean r1 = r0.equals(r1)
            r0 = 0
            if (r1 == 0) goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            r2 = 0
            if (r0 == 0) goto L_0x0033
            android.content.ContentResolver r1 = r4.getContentResolver()
            java.lang.String r0 = "external_surround_sound_enabled"
            int r1 = android.provider.Settings.Global.getInt(r1, r0, r2)
            r0 = 1
            if (r1 != r0) goto L_0x0033
            X.7no r1 = A03
            return r1
        L_0x0033:
            if (r3 == 0) goto L_0x0051
            java.lang.String r0 = "android.media.extra.AUDIO_PLUG_STATE"
            int r0 = r3.getIntExtra(r0, r2)
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = "android.media.extra.ENCODINGS"
            int[] r2 = r3.getIntArrayExtra(r0)
            java.lang.String r1 = "android.media.extra.MAX_CHANNEL_COUNT"
            r0 = 8
            int r0 = r3.getIntExtra(r1, r0)
            X.7no r1 = new X.7no
            r1.<init>(r2, r0)
            return r1
        L_0x0051:
            X.7no r1 = A02
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160527no.A00(android.content.Context):X.7no");
    }

    public int hashCode() {
        return this.A00 + (Arrays.hashCode(this.A01) * 31);
    }

    static {
        int[] A0E = C18330xA.A0E();
        A0E[0] = 2;
        A02 = new C160527no(A0E, 8);
    }

    public C160527no(int[] iArr, int i) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.A01 = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.A01 = new int[0];
        }
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AudioCapabilities[maxChannelCount=");
        A0o.append(this.A00);
        A0o.append(", supportedEncodings=");
        return AnonymousClass000.A0W(Arrays.toString(this.A01), A0o);
    }
}
