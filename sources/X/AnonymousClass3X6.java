package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3X6  reason: invalid class name */
public class AnonymousClass3X6 implements C84134Bd {
    public int A00 = 0;
    public boolean A01 = false;
    public final /* synthetic */ AnonymousClass30M A02;
    public final /* synthetic */ C56232re A03;
    public final /* synthetic */ AnonymousClass3QO A04;
    public final /* synthetic */ C633138t A05;

    public AnonymousClass3X6(AnonymousClass30M r2, C56232re r3, AnonymousClass3QO r4, C633138t r5) {
        this.A03 = r3;
        this.A05 = r5;
        this.A02 = r2;
        this.A04 = r4;
    }

    public /* bridge */ /* synthetic */ void AwB(Object obj) {
        String str;
        String str2;
        String str3 = (String) obj;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("sendmediamessagemanager/whenhttpconnected connection built on url. Attempt: ");
        int i = this.A00;
        this.A00 = i + 1;
        C18260x0.A1F(A0o, i);
        if (C617832f.A00(str3)) {
            C56232re r7 = this.A03;
            AnonymousClass1VX r4 = r7.A0B;
            if (C56952sp.A0I(r4)) {
                C633138t r1 = this.A05;
                if (r1 == C633138t.A09 || r1 == C633138t.A0C || r1 == C633138t.A0g) {
                    AnonymousClass30M r6 = this.A02;
                    List unmodifiableList = Collections.unmodifiableList(r6.A02);
                    if (unmodifiableList.size() == 1 && (C18320x8.A0R(unmodifiableList, 0).A1J.A00 instanceof PhoneUserJid) && !this.A01) {
                        AnonymousClass3QO r3 = this.A04;
                        AnonymousClass2UD A002 = r3.A00();
                        if (r4.A0Y(C58422vE.A02, 6502)) {
                            str = A002.A09;
                            str2 = A002.A08;
                        } else {
                            AnonymousClass1I5 r0 = (AnonymousClass1I5) r7.A0K.A01(r3);
                            if (r0 != null) {
                                C56752sV r02 = r0.A0X;
                                str = r02.A06();
                                str2 = r02.A05();
                            } else {
                                str = null;
                                str2 = null;
                            }
                        }
                        long j = A002.A03;
                        C95814uZ r32 = r6.A00().A1J.A00;
                        if (str == null || str2 == null || j <= 0 || r32 == null) {
                            Log.e("sendmediamessagemanager/whenhttpconnected could not send medianotify since some params are invalid");
                        } else {
                            C30511mZ r12 = new C30511mZ(AnonymousClass35J.A01(r32, r7.A0N), r7.A04.A0H());
                            r12.A03 = str3;
                            r12.A02 = str;
                            r12.A01 = str2;
                            r12.A00 = j;
                            r7.A06.A0V(r12);
                        }
                        this.A01 = true;
                    }
                }
            }
        }
    }
}
