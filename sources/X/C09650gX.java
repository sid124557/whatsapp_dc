package X;

/* renamed from: X.0gX  reason: invalid class name and case insensitive filesystem */
public class C09650gX implements C16300sn {
    public final /* synthetic */ AnonymousClass0Y5 A00;
    public final /* synthetic */ C16300sn A01;
    public final /* synthetic */ C186468vN A02;

    public C09650gX(AnonymousClass0Y5 r1, C16300sn r2, C186468vN r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void BZr(int i) {
        C186468vN r1;
        String str;
        C186468vN r12;
        String str2;
        String str3 = "Bloks Request Error.";
        try {
            this.A01.BZr(i);
            AnonymousClass0Y5 r0 = this.A00;
            Object obj = r0.A0A.get();
            if (obj != null) {
                C160367nW r15 = (C160367nW) obj;
                int i2 = r15.A00;
                switch (i) {
                    case 1:
                        r12 = this.A02;
                        str2 = AnonymousClass0Y5.A03("initial_render_start", i2);
                        break;
                    case 2:
                        r12 = this.A02;
                        str2 = AnonymousClass0Y5.A03("initial_render_end", i2);
                        break;
                    case 3:
                        C186468vN r3 = this.A02;
                        r3.BKj(AnonymousClass0Y5.A03("initial_render_data_end", i2));
                        if (r0.A00 == null) {
                            r3.AyH(0, "bloks_query", true, r0.A07.now());
                        }
                        C09640gW r2 = r0.A05;
                        if (r2.A04 == null || r2.A0A) {
                            r3.Bq9("initial_content_step");
                            return;
                        }
                        return;
                    case 5:
                        Throwable A08 = r0.A08();
                        if (A08 != null) {
                            str3 = A08.getMessage();
                        }
                        this.A02.B30(str3);
                        return;
                    case 6:
                        r12 = this.A02;
                        str2 = AnonymousClass0Y5.A03("render_start", i2);
                        break;
                    case 7:
                        r12 = this.A02;
                        str2 = AnonymousClass0Y5.A03("render_end", i2);
                        break;
                    case 9:
                        C186468vN r32 = this.A02;
                        r32.BKj(AnonymousClass0Y5.A03("render_data_end", i2));
                        r0.A0D(r32, r15);
                        return;
                    case 11:
                        r12 = this.A02;
                        str2 = AnonymousClass0Y5.A03("render_load_action_start", i2);
                        break;
                    case 12:
                        r12 = this.A02;
                        str2 = AnonymousClass0Y5.A03("stream_on_load_actions_start", i2);
                        break;
                    case 13:
                        r12 = this.A02;
                        str2 = AnonymousClass0Y5.A03("stream_on_load_actions_end", i2);
                        break;
                    default:
                        return;
                }
                r12.BKj(str2);
                return;
            }
            throw AnonymousClass001.A0c("Fetch summary is missing.");
        } catch (Throwable th) {
            AnonymousClass0Y5 r22 = this.A00;
            Object obj2 = r22.A0A.get();
            if (obj2 != null) {
                C160367nW r152 = (C160367nW) obj2;
                int i3 = r152.A00;
                switch (i) {
                    case 1:
                        r1 = this.A02;
                        str = AnonymousClass0Y5.A03("initial_render_start", i3);
                        break;
                    case 2:
                        r1 = this.A02;
                        str = AnonymousClass0Y5.A03("initial_render_end", i3);
                        break;
                    case 3:
                        C186468vN r33 = this.A02;
                        r33.BKj(AnonymousClass0Y5.A03("initial_render_data_end", i3));
                        if (r22.A00 == null) {
                            r33.AyH(0, "bloks_query", true, r22.A07.now());
                        }
                        C09640gW r23 = r22.A05;
                        if (r23.A04 == null || r23.A0A) {
                            r33.Bq9("initial_content_step");
                            throw th;
                        }
                        throw th;
                    case 5:
                        Throwable A082 = r22.A08();
                        if (A082 != null) {
                            str3 = A082.getMessage();
                        }
                        this.A02.B30(str3);
                        throw th;
                    case 6:
                        r1 = this.A02;
                        str = AnonymousClass0Y5.A03("render_start", i3);
                        break;
                    case 7:
                        r1 = this.A02;
                        str = AnonymousClass0Y5.A03("render_end", i3);
                        break;
                    case 9:
                        C186468vN r13 = this.A02;
                        r13.BKj(AnonymousClass0Y5.A03("render_data_end", i3));
                        r22.A0D(r13, r152);
                        throw th;
                    case 11:
                        r1 = this.A02;
                        str = AnonymousClass0Y5.A03("render_load_action_start", i3);
                        break;
                    case 12:
                        r1 = this.A02;
                        str = AnonymousClass0Y5.A03("stream_on_load_actions_start", i3);
                        break;
                    case 13:
                        r1 = this.A02;
                        str = AnonymousClass0Y5.A03("stream_on_load_actions_end", i3);
                        break;
                    default:
                        throw th;
                }
                r1.BKj(str);
                throw th;
            }
            throw AnonymousClass001.A0c("Fetch summary is missing.");
        }
    }
}
