package X;

import android.util.SparseArray;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.3Mo  reason: invalid class name and case insensitive filesystem */
public class C66733Mo implements C84544Ct {
    public final C380625j A00;
    public final AnonymousClass33p A01;
    public final C183538qC A02;
    public final AnonymousClass4C1 A03;

    public void BlE(C56172rX r11, boolean z) {
        long j;
        String str;
        String str2;
        boolean z2;
        if (!AnonymousClass000.A1U(((C66353La) this.A02.get()).A00.A04, 2)) {
            str2 = "WamSender/send/mh-disconnected";
        } else {
            int i = r11.A02;
            if (i == 1) {
                C56392ru r1 = r11.A04;
                if (!r1.A00.A05() && r1.A05()) {
                    r11.A03();
                }
            } else if (i == 0) {
                C56392ru r3 = r11.A04;
                if (r3.A06()) {
                    str = "WamSender/mayberotatebuffer: skipping since there is already data to send";
                } else if (r3.A00.A05()) {
                    str = "WamSender/mayberotatebuffer: cannot rotate since there is no data";
                } else {
                    long A08 = C18290x4.A08();
                    AnonymousClass33p r7 = this.A01;
                    if (C18280x3.A1W(AnonymousClass0x2.A0F(r7), "wam_is_current_buffer_real_time")) {
                        j = 300;
                    } else {
                        j = 600;
                    }
                    if (!z) {
                        C56132rT r4 = r3.A00;
                        long j2 = A08 - r4.A06.A05[r4.A02].A04;
                        if (j2 <= j) {
                            StringBuilder A0o = AnonymousClass001.A0o();
                            A0o.append("WamSender/mayberotatebuffer: it isn't time to rotate; ");
                            A0o.append(j - j2);
                            str = AnonymousClass000.A0X(" seconds remaining", A0o);
                        }
                    }
                    r11.A03();
                    C18270x1.A0v(r7, "wam_is_current_buffer_real_time", false);
                    str = "WamSender/mayberotatebufer: got data after rotation";
                }
                Log.d(str);
            }
            C56392ru r32 = r11.A04;
            if (r32.A06()) {
                C18260x0.A0w("WamSender/send: buffer channel type", AnonymousClass001.A0o(), i);
                if (r11.A00) {
                    r11.A02();
                }
                SparseArray A002 = r32.A00();
                C41592Kv r6 = (C41592Kv) this.A03.get();
                ArrayList A0I = AnonymousClass002.A0I(A002.size());
                int i2 = 0;
                while (true) {
                    if (i2 >= A002.size()) {
                        break;
                    }
                    Iterator it = r6.A01.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z2 = false;
                            break;
                        }
                        C44712Xe r2 = (C44712Xe) it.next();
                        if (r2.A00()) {
                            StringBuilder A0o2 = AnonymousClass001.A0o();
                            C18260x0.A0m(C18310x6.A0c(r2, "WamSender/sending: postponed due to ", A0o2), A0o2);
                            z2 = true;
                            break;
                        }
                    }
                    C66353La r8 = r6.A00;
                    AnonymousClass31C r12 = r8.A01;
                    if (!r12.A02.A06 || r12.A0D == null || z2) {
                        break;
                    }
                    int keyAt = A002.keyAt(i2);
                    C18260x0.A0y("WamSender/sending/buffer:", AnonymousClass001.A0o(), keyAt);
                    boolean A003 = r8.A00((byte[]) A002.get(keyAt));
                    StringBuilder A0o3 = AnonymousClass001.A0o();
                    if (!A003) {
                        C18260x0.A0y("WamSender/fail/buffer:", A0o3, keyAt);
                        break;
                    }
                    C18260x0.A0y("WamSender/send/buffer:", A0o3, keyAt);
                    C18270x1.A1K(A0I, keyAt);
                    i2++;
                }
                if (!A0I.isEmpty()) {
                    Log.i("WamSender/send: successfully sent data; dropping the buffer");
                    r32.A04(A0I);
                    r11.A02();
                    str2 = "WamSender/sendack: dropped rotated buffer";
                } else {
                    str2 = "WamSender/send: failed to send data";
                }
            } else {
                Log.d("WamSender/send: not ready to send");
                return;
            }
        }
        Log.i(str2);
    }

    public void BlG(C56172rX r2, int i, boolean z, boolean z2) {
        throw AnonymousClass002.A0G("fieldstatssender/send should not call send method with dithered info");
    }

    public C66733Mo(C380625j r1, AnonymousClass33p r2, C183538qC r3, AnonymousClass4C1 r4) {
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }
}
