package X;

import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Pair;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.1LX  reason: invalid class name */
public class AnonymousClass1LX extends C153117ah implements C184458rr {
    public final C56492s4 A00;
    public final C56612sH A01;
    public final AnonymousClass1VX A02;
    public final AnonymousClass4FV A03;
    public final C55002pd A04;
    public final C29011i8 A05;

    public Pair A00(AnonymousClass7PR r23) {
        C182988pJ r3;
        Integer num;
        Integer num2;
        String str;
        Bitmap bitmap;
        byte[] byteArray;
        ByteArrayInputStream A0d;
        AnonymousClass7PR r2 = r23;
        String str2 = r2.A04;
        Uri parse = Uri.parse(str2);
        if (parse == null || !"static.whatsapp.net".equals(parse.getAuthority())) {
            r3 = new AnonymousClass8JU(str2, "image");
        } else {
            r3 = new AnonymousClass3UO(str2);
        }
        AnonymousClass8HW r1 = new AnonymousClass8HW();
        AnonymousClass7L2 r10 = new AnonymousClass7L2(r1, r3, false);
        C56612sH r7 = this.A01;
        C56492s4 r6 = this.A00;
        C29011i8 r12 = this.A05;
        C55002pd r8 = this.A04;
        C56852sf r9 = r2.A02;
        ConcurrentMap concurrentMap = r2.A05;
        Iterator A0v = AnonymousClass001.A0v(concurrentMap);
        while (true) {
            if (!A0v.hasNext()) {
                num = null;
                break;
            }
            C186038ue r0 = (C186038ue) A0v.next();
            if (r0 != null) {
                num = r0.BAD();
                break;
            }
        }
        Iterator A0v2 = AnonymousClass001.A0v(concurrentMap);
        while (true) {
            if (A0v2.hasNext()) {
                if (A0v2.next() != null) {
                    num2 = AnonymousClass001.A0f();
                    break;
                }
            } else {
                num2 = null;
                break;
            }
        }
        String str3 = "";
        if (num != null) {
            str = C106695a0.A00(num.intValue());
        } else {
            str = str3;
        }
        if (num2 != null) {
            int intValue = num2.intValue();
            if (intValue == 0) {
                str3 = "manual";
            } else if (intValue == 1) {
                str3 = "full";
            } else if (intValue == 2) {
                str3 = "prefetch";
            } else if (intValue != 3) {
                str3 = "unknown";
            } else {
                str3 = "aggressive_prefetch";
            }
        }
        AnonymousClass1VX r32 = this.A02;
        String str4 = r2.A02.A0g.A02;
        C162457s7.A0J(r32, 1);
        C625435m r62 = new C72143dF(r6, r7, r8, r9, r10, this, r12, new C46822cG(r32, (Integer) null, str, str4, str3, false), false).B2A().A00;
        C26051bV r5 = r62.A00;
        if (r5 != null) {
            Iterator A0v3 = AnonymousClass001.A0v(concurrentMap);
            while (true) {
                if (!A0v3.hasNext()) {
                    break;
                }
                Integer BAD = ((C186038ue) A0v3.next()).BAD();
                r5.A0G = BAD;
                if (BAD != null) {
                    r5.A0I = Integer.valueOf(C106495Zf.A00(r2.A02.A0g.A00, BAD.intValue(), false));
                    r5.A0F = C18280x3.A0S();
                    boolean A1T = AnonymousClass000.A1T(r62.A01);
                    AnonymousClass4FV r33 = this.A03;
                    if (A1T) {
                        r33.BhD(r5);
                    } else {
                        C18280x3.A0t(r5, r33, true);
                    }
                }
            }
        }
        if (AnonymousClass000.A1T(r62.A01)) {
            ByteArrayOutputStream byteArrayOutputStream = r1.A00;
            if (byteArrayOutputStream == null) {
                byteArray = null;
            } else {
                byteArray = byteArrayOutputStream.toByteArray();
            }
            C626936e.A06(byteArray);
            String A042 = C627236i.A04(r2.A03);
            C626936e.A06(A042);
            try {
                A0d = AnonymousClass0x9.A0d(byteArray);
                this.A03.A04(A0d, A042);
                A0d.close();
            } catch (IOException unused) {
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            bitmap = this.A03.A01(A042, r2.A01, r2.A00, false);
        } else {
            bitmap = null;
        }
        return AnonymousClass0x9.A0C(Boolean.TRUE, bitmap);
        throw th;
    }

    public /* synthetic */ void BRV(long j) {
    }

    public void BRY(int i) {
    }

    public AnonymousClass1LX(C69263Wi r10, C56492s4 r11, C185398ta r12, C56612sH r13, AnonymousClass1VX r14, AnonymousClass4FV r15, C55002pd r16, C29011i8 r17, File file, String str, int i) {
        super(r10, r12, file, str, i, 16777216);
        this.A01 = r13;
        this.A02 = r14;
        this.A00 = r11;
        this.A03 = r15;
        this.A05 = r17;
        this.A04 = r16;
    }
}
