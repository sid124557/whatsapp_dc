package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;

/* renamed from: X.1mz  reason: invalid class name and case insensitive filesystem */
public class C30771mz extends AnonymousClass1n2 implements AnonymousClass4B9 {
    public int A00;
    public UserJid A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public BigDecimal A0A;
    public BigDecimal A0B;

    public C30771mz(AnonymousClass33C r2, AnonymousClass2z0 r3, C30771mz r4, long j, boolean z) {
        super(r2, r3, r4, j, z);
        this.A01 = r4.A01;
        this.A06 = r4.A06;
        this.A09 = r4.A09;
        this.A04 = r4.A04;
        this.A03 = r4.A03;
        this.A0A = r4.A0A;
        this.A0B = r4.A0B;
        this.A08 = r4.A08;
        this.A07 = r4.A07;
        this.A00 = r4.A00;
        this.A02 = r4.A02;
        this.A05 = r4.A05;
    }

    public String A23() {
        StringBuilder A0o = AnonymousClass001.A0o();
        if (!TextUtils.isEmpty(this.A09)) {
            A0o.append(this.A09);
        }
        if (!TextUtils.isEmpty(this.A02)) {
            if (!TextUtils.isEmpty(A0o)) {
                A0o.append("\n");
            }
            A0o.append(this.A02);
        }
        if (!TextUtils.isEmpty(this.A05)) {
            if (!TextUtils.isEmpty(A0o)) {
                A0o.append("\n");
            }
            A0o.append(this.A05);
        }
        return A0o.toString();
    }

    public C30771mz(AnonymousClass2z0 r2, long j) {
        super(r2, (byte) 23, j);
    }
}
