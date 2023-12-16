package X;

import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import java.util.Map;

/* renamed from: X.96f  reason: invalid class name and case insensitive filesystem */
public final class C1904396f extends AnonymousClass9ZP implements C203689o9 {
    public final C187508xK A00;
    public final AnonymousClass9Z2 A01;
    public final AnonymousClass9Z9 A02 = new AnonymousClass9Z9();
    public final AnonymousClass9Z5 A03 = new AnonymousClass9Z5();
    public final AnonymousClass9Z7 A04 = new AnonymousClass9Z7();
    public final C150467Qv A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1904396f(C187508xK r5, C203449ni r6, C150467Qv r7) {
        super(r6);
        C162457s7.A0J(r5, 3);
        this.A05 = r7;
        this.A00 = r5;
        C162457s7.A0D(C18280x3.A0Y());
        this.A01 = new AnonymousClass9Z2(r7);
        String str = (String) this.A00.B5l(C194719Uf.A02);
        if (str != null && !str.equals(SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME)) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Unexpected ProductName ");
            IllegalArgumentException A0F = AnonymousClass000.A0F(str, A0o);
            BpT("CameraCore::ProductName", A0F, false);
            throw A0F;
        }
    }

    public void BpT(String str, Throwable th, boolean z) {
        C162457s7.A0J(str, 0);
        this.A05.A00(AnonymousClass000.A0V("WhatsAppOneCameraLogger/softReportError Category = ", str, AnonymousClass001.A0o()), th);
    }

    public void BK2(String str, String str2, Map map, long j) {
        C162457s7.A0J(str, 0);
        A01(str);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WhatsAppOneCameraLogger/logAudioPipelineEvent Event = ");
        A00(str, "AudioPipelineController", A0o, j);
        C162457s7.A0J(AnonymousClass000.A0P(map, ", Extras = ", A0o), 0);
    }

    public void BK4(String str, String str2, Map map, long j) {
        C162457s7.A0J(str, 0);
        A01(str);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WhatsAppOneCameraLogger/logCameraEvent Event = ");
        A00(str, "ComponentManager", A0o, j);
        C162457s7.A0J(AnonymousClass000.A0P((Object) null, ", Extras = ", A0o), 0);
    }

    public void BKI(AnonymousClass9KO r7, String str, String str2, String str3, String str4, Map map, long j) {
        C162457s7.A0J(str3, 4);
        A01("media_pipeline_error");
        C150467Qv r2 = this.A05;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WhatsAppOneCameraLogger/logMediaPipelineError Event = ");
        A00("media_pipeline_error", "MediaGraphControllerImpl", A0o, j);
        A0o.append(", Severity = ");
        A0o.append(str3);
        A0o.append(", Source = ");
        A0o.append("MediaGraphControllerImpl");
        r2.A00(AnonymousClass000.A0P((Object) null, ", Extras = ", A0o), r7);
    }

    public void BiT(long j, boolean z) {
        AnonymousClass9RR r1 = this.A02.A02;
        r1.A00 = true;
        r1.A01.A00(j);
        C194299Si r5 = r1.A03;
        if (r5.A04 != 0) {
            r5.A03++;
        }
        r5.A04 = j;
    }

    public void BiU(long j) {
        AnonymousClass9RR r6 = this.A02.A02;
        C194299Si r5 = r6.A01;
        if (r5.A04 != 0) {
            r5.A03++;
        }
        r5.A04 = j;
        if (r6.A00) {
            r6.A03.A00(j);
        }
    }

    public static void A00(String str, String str2, StringBuilder sb, long j) {
        sb.append(str);
        sb.append(", Component Name = ");
        sb.append(str2);
        sb.append(", Component ID = ");
        sb.append(j);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r4.equals(r0) == false) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        r0 = r3.A04;
        r2 = X.AnonymousClass9JT.A01;
        r1 = r0.A00;
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        if (r4.equals(r0) == false) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        r0 = r3.A04;
        r2 = X.AnonymousClass9JT.A01;
        r1 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        if (r1.get(r2) != null) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        r0 = X.C18280x3.A0Y();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        r1.put(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r2 = 40;
        r0 = r4.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (40 <= r0) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        X.C162457s7.A0D(r4.substring(0, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(java.lang.String r4) {
        /*
            r3 = this;
            int r1 = r4.hashCode()
            java.lang.String r0 = "media_pipeline_start"
            switch(r1) {
                case -1629286812: goto L_0x001b;
                case 1028385748: goto L_0x001e;
                case 1031703104: goto L_0x0030;
                case 1876082191: goto L_0x002e;
                default: goto L_0x0009;
            }
        L_0x0009:
            r2 = 40
            r1 = 0
            int r0 = r4.length()
            if (r2 <= r0) goto L_0x0013
            r2 = r0
        L_0x0013:
            java.lang.String r0 = r4.substring(r1, r2)
            X.C162457s7.A0D(r0)
            return
        L_0x001b:
            java.lang.String r0 = "media_pipeline_stop"
            goto L_0x0020
        L_0x001e:
            java.lang.String r0 = "media_pipeline_pause"
        L_0x0020:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.9Z7 r0 = r3.A04
            X.9JT r2 = X.AnonymousClass9JT.A01
            java.util.HashMap r1 = r0.A00
            r0 = 0
            goto L_0x0046
        L_0x002e:
            java.lang.String r0 = "media_pipeline_resume"
        L_0x0030:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.9Z7 r0 = r3.A04
            X.9JT r2 = X.AnonymousClass9JT.A01
            java.util.HashMap r1 = r0.A00
            java.lang.Object r0 = r1.get(r2)
            if (r0 != 0) goto L_0x0009
            java.lang.String r0 = X.C18280x3.A0Y()
        L_0x0046:
            r1.put(r2, r0)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1904396f.A01(java.lang.String):void");
    }

    public void BKJ(String str, String str2, Map map, long j) {
        C18260x0.A0O(str, str2);
        A01(str);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WhatsAppOneCameraLogger/logMediaPipelineEvent Event = ");
        A00(str, str2, A0o, j);
        C162457s7.A0J(AnonymousClass000.A0P(map, ", Extras = ", A0o), 0);
    }

    public Map BGU(C192939Mi r1, Map map) {
        return map;
    }

    public C202889mm B5E() {
        return this.A03;
    }

    public AnonymousClass9LH B8v() {
        return C203689o9.A00;
    }

    public C202899mn BBG() {
        return this.A02;
    }

    public String BBj() {
        return SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME;
    }
}
