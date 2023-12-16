package X;

import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.3X8  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3X8 implements C84134Bd {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Pair A01;
    public final /* synthetic */ C85044Es A02;
    public final /* synthetic */ C620033c A03;
    public final /* synthetic */ AnonymousClass3QN A04;
    public final /* synthetic */ C61212zt A05;
    public final /* synthetic */ File A06;
    public final /* synthetic */ String A07;

    public final void AwB(Object obj) {
        C620033c r9 = this.A03;
        AnonymousClass3QN r5 = this.A04;
        C61212zt r2 = this.A05;
        C85044Es r4 = this.A02;
        String str = this.A07;
        File file = this.A06;
        Pair pair = this.A01;
        long j = this.A00;
        C149897Oi r12 = (C149897Oi) obj;
        AnonymousClass4FV r8 = r9.A07;
        AnonymousClass5LM r10 = r5.A00;
        C619833a r11 = r5.A01;
        int i = r12.A00;
        r8.BhD(r9.A05(r10, r11, r12, i, 1, 0).A00);
        C56752sV r52 = r12.A02;
        AnonymousClass32B A002 = r52.A00();
        if (i == 0 && ((!r2.A02.A0D || A002 != null) && r52.A03() != null)) {
            File A0T = r9.A01.A0T(r52.A03());
            try {
                C627536m.A0D(r9.A0L, file, A0T);
                AnonymousClass32B A003 = r52.A00();
                C55592qb r92 = new C55592qb();
                r92.A04 = r52.A03();
                if (A003 != null) {
                    r92.A0A = A003.A01;
                    r92.A02 = A003.A00;
                }
                r92.A05 = r52.A05();
                r92.A08 = r52.A06();
                r92.A01 = C18290x4.A03(pair);
                r92.A00 = C18280x3.A03(pair);
                r92.A03 = AnonymousClass0x9.A05(j);
                r92.A06 = r52.A04();
                r4.Bmc(r92, str);
                return;
            } catch (IOException e) {
                Object[] A1b = C18310x6.A1b(file, 0);
                A1b[1] = A0T;
                Log.w(String.format("MediaJobManager/renameThumbnailFileToMmsDirectPath Fail to rename from %s to %s.", A1b), e);
                C627536m.A0O(A0T);
            }
        }
        r4.Bma(str);
    }

    public /* synthetic */ AnonymousClass3X8(Pair pair, C85044Es r2, C620033c r3, AnonymousClass3QN r4, C61212zt r5, File file, String str, long j) {
        this.A03 = r3;
        this.A04 = r4;
        this.A05 = r5;
        this.A02 = r2;
        this.A07 = str;
        this.A06 = file;
        this.A01 = pair;
        this.A00 = j;
    }
}
