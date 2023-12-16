package X;

import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.3X9  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3X9 implements C84134Bd {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ long A06;
    public final /* synthetic */ long A07;
    public final /* synthetic */ long A08;
    public final /* synthetic */ long A09;
    public final /* synthetic */ long A0A;
    public final /* synthetic */ long A0B;
    public final /* synthetic */ C51442jp A0C;
    public final /* synthetic */ DeviceJid A0D;
    public final /* synthetic */ AnonymousClass3QO A0E;
    public final /* synthetic */ C614330s A0F;
    public final /* synthetic */ AnonymousClass1A0 A0G;
    public final /* synthetic */ File A0H;
    public final /* synthetic */ String A0I;
    public final /* synthetic */ String A0J;

    public final void AwB(Object obj) {
        C149897Oi A022;
        C614330s r5 = this.A0F;
        File file = this.A0H;
        AnonymousClass3QO r8 = this.A0E;
        int i = this.A02;
        C51442jp r47 = this.A0C;
        String str = this.A0J;
        int i2 = this.A03;
        AnonymousClass1A0 r3 = this.A0G;
        long j = this.A0A;
        long j2 = this.A0B;
        int i3 = this.A00;
        DeviceJid deviceJid = this.A0D;
        long j3 = this.A04;
        long j4 = this.A05;
        long j5 = this.A06;
        long j6 = this.A07;
        int i4 = this.A01;
        long j7 = this.A08;
        String str2 = this.A0I;
        long j8 = this.A09;
        Number number = (Number) obj;
        C18260x0.A1P(AnonymousClass001.A0o(), "history-sync-send-methods/data uploaded:", number);
        if (!file.delete()) {
            C18260x0.A1S(AnonymousClass001.A0o(), "history-sync-send-methods/failed to delete temp file: ", file);
        }
        AnonymousClass4FV r9 = r5.A0T;
        C620033c r6 = r5.A0Y;
        int intValue = number.intValue();
        r9.BhD(r6.A06(r8, intValue, 8).A00);
        r8.A03();
        if (intValue != 0 || (A022 = r8.A02()) == null) {
            C51442jp r12 = r47;
            r5.A05(r12, str, i, i3, 3, (long) i2, (long) ((AnonymousClass1E2) r3.A00).conversations_.size(), j, j2);
            if (i != 2 && i != 3) {
                return;
            }
            if (i4 > 0) {
                Log.w("history-sync-send-methods/handleMMSFailure retry more than once");
            } else if (r5.A0S.A0Y(C58422vE.A02, 4879)) {
                r5.A0Q.A02(new C54082o9(r12, deviceJid, i, i3, 3, -1, j4, j3, j5, j6, 0, 0, -1, 0));
            }
        } else {
            if (i == 0) {
                r5.A0P.A01(true);
            }
            C56752sV r0 = A022.A02;
            String A032 = r0.A03();
            String A062 = r0.A06();
            String A052 = r0.A05();
            AnonymousClass32B A002 = r0.A00();
            if (A002 == null || TextUtils.isEmpty(A032) || TextUtils.isEmpty(A062) || TextUtils.isEmpty(A052)) {
                r5.A05(r47, str, i, i3, 4, (long) i2, (long) ((AnonymousClass1E2) r3.A00).conversations_.size(), j, j2);
                return;
            }
            r5.A03(r47, deviceJid, A002, r3, str, str2, A032, A062, A052, i3, i, i2, i4, j7, j3, j4, j5, j, j8, j2, false);
        }
    }

    public /* synthetic */ AnonymousClass3X9(C51442jp r3, DeviceJid deviceJid, AnonymousClass3QO r5, C614330s r6, AnonymousClass1A0 r7, File file, String str, String str2, int i, int i2, int i3, int i4, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.A0F = r6;
        this.A0H = file;
        this.A0E = r5;
        this.A02 = i;
        this.A0C = r3;
        this.A0J = str;
        this.A03 = i2;
        this.A0G = r7;
        this.A0A = j;
        this.A0B = j2;
        this.A00 = i3;
        this.A0D = deviceJid;
        this.A04 = j3;
        this.A05 = j4;
        this.A06 = j5;
        this.A07 = j6;
        this.A01 = i4;
        this.A08 = j7;
        this.A0I = str2;
        this.A09 = j8;
    }
}
