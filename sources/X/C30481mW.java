package X;

import com.whatsapp.TextData;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1mW  reason: invalid class name and case insensitive filesystem */
public class C30481mW extends C624134x implements AnonymousClass4B9, AnonymousClass4BB {
    public int A00;
    public int A01 = 0;
    public TextData A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public byte[] A08;

    public C30481mW A1v(AnonymousClass2z0 r11, long j) {
        C30481mW r1;
        TextData textData;
        String A20;
        if (this instanceof C31931p6) {
            throw new C376723o("ViewOnce messages can not be forwarded");
        }
        AnonymousClass2z0 r5 = r11;
        long j2 = j;
        if (this instanceof AnonymousClass1p5) {
            AnonymousClass1p5 r6 = (AnonymousClass1p5) this;
            r1 = new C30481mW(r11, j);
            if (r11.A00 instanceof C135166kE) {
                A20 = r6.A1w();
            } else {
                A20 = r6.A20();
            }
            r1.A1Z(A20);
            if (r6.A02 != null) {
                r1.A02 = null;
                textData = r6.A02;
            }
            return r1;
        } else if ((this instanceof C31921p4) || (this instanceof C31911p3)) {
            r1 = new C30481mW(r11, j);
            r1.A1Z(A13());
            if (this.A02 != null) {
                r1.A02 = null;
                textData = this.A02;
            }
            return r1;
        } else {
            C30481mW r4 = new C30481mW(r5, this, j2, false);
            C42592Ot A012 = C40802Hu.A01(this);
            if (A012 != null) {
                r4.A1U(new C42592Ot(A012.A00, A012.A01, AnonymousClass001.A0s()));
            }
            if (this.A02 != null) {
                r4.A02 = null;
                r4.A1y(this.A02.thumbnail);
            }
            return r4;
        }
        r1.A1y(textData.thumbnail);
        return r1;
    }

    public C624134x Az3(AnonymousClass2z0 r9) {
        AnonymousClass2z0 r3 = r9;
        if (this instanceof C31931p6) {
            C31931p6 r4 = (C31931p6) this;
            return new C31931p6(r9, r4, r4.A0K);
        } else if (this instanceof AnonymousClass1p5) {
            AnonymousClass1p5 r42 = (AnonymousClass1p5) this;
            return new AnonymousClass1p5(r9, r42, r42.A0K);
        } else if (this instanceof C31921p4) {
            C31921p4 r43 = (C31921p4) this;
            return new C31921p4(r9, r43, r43.A0K);
        } else if (this instanceof C31901p2) {
            C31901p2 r44 = (C31901p2) this;
            C162457s7.A0J(r9, 0);
            return new C31901p2(r9, r44, r44.A0K);
        } else if (!(this instanceof C31911p3)) {
            return new C30481mW(r3, this, this.A0K, true);
        } else {
            C31911p3 r45 = (C31911p3) this;
            return new C31911p3(r9, r45, r45.A0K);
        }
    }

    public static C30481mW A00(AnonymousClass2z0 r2, String str, long j) {
        ArrayList arrayList = new ArrayList();
        C30481mW r0 = new C30481mW(r2, j);
        r0.A1Z(str);
        r0.A1g(arrayList);
        return r0;
    }

    public String A1w() {
        if (!(this instanceof AnonymousClass1p5)) {
            return A13();
        }
        AnonymousClass1p5 r4 = (AnonymousClass1p5) this;
        if (C624134x.A0a(r4)) {
            return r4.A00.A02;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("*");
        A0o2.append(r4.A13());
        C18270x1.A1C("*", A0o2, A0o);
        A0o.append("\n\n");
        return AnonymousClass000.A0X(r4.A00.A02, A0o);
    }

    public void A1x(TextData textData) {
        byte[] bArr;
        if (!(textData == null || (bArr = this.A08) == null)) {
            textData.thumbnail = bArr;
            this.A08 = null;
        }
        this.A02 = textData;
    }

    public void A1y(byte[] bArr) {
        TextData textData = this.A02;
        if (textData != null) {
            textData.thumbnail = bArr;
        } else {
            this.A08 = bArr;
        }
    }

    public byte[] A1z() {
        TextData textData = this.A02;
        if (textData != null) {
            return textData.thumbnail;
        }
        return this.A08;
    }

    public C30481mW(AnonymousClass2z0 r2, byte b, long j) {
        super(r2, b, j);
    }

    public List BDE() {
        C52042kn A022;
        C95814uZ r3;
        C55162pu A0t = A0t();
        if (!C624134x.A0g(this) || A0t == null || (A022 = A0t.A02()) == null || (r3 = A022.A00) == null) {
            return null;
        }
        AnonymousClass39V[] r2 = new AnonymousClass39V[2];
        AnonymousClass39V.A04("thread_msg_id", A022.A01.A01, r2);
        r2[1] = new AnonymousClass39V((Jid) r3, "thread_msg_sender_jid");
        return C624134x.A0D(r2);
    }

    public C30481mW(AnonymousClass2z0 r2, long j) {
        super(r2, (byte) 0, j);
    }

    public C30481mW(AnonymousClass2z0 r8, C30481mW r9, long j, boolean z) {
        super(r9, r8, j, z);
        this.A06 = r9.A06;
        this.A04 = r9.A04;
        this.A07 = r9.A07;
        this.A02 = r9.A02;
        this.A08 = r9.A08;
        this.A01 = r9.A01;
        this.A00 = r9.A00;
    }
}
