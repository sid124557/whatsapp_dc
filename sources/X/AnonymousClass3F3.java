package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.3F3  reason: invalid class name */
public class AnonymousClass3F3 implements AnonymousClass4E5 {
    public final /* synthetic */ C623734t A00;

    public void BF7(AnonymousClass227 r8, String str, int i, int i2, long j) {
        SharedPreferences.Editor A01;
        String str2;
        C623734t r6 = this.A00;
        r6.A02 = AnonymousClass0x9.A0m(i2);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("contactsyncmanager/handleSyncContactError/error sid=");
        A0o.append(str);
        A0o.append(" index=");
        A0o.append(0);
        A0o.append(" code=");
        A0o.append(i2);
        C18260x0.A11(" backoff=", A0o, j);
        if (j > 0) {
            long A0H = r6.A0F.A0H() + j;
            C56882si r5 = r6.A0A;
            C18270x1.A0i(C56882si.A01(r5), "contact_sync_backoff", A0H);
            if (i2 == 503 && r6.A0J.A0Y(C58422vE.A02, 1297)) {
                Log.e("contactsyncmanager/handleSyncContactError need global backoff");
                A01 = C56882si.A01(r5);
                str2 = "global_backoff_time";
            } else if (r6.A0J.A0Y(C58422vE.A02, 949) && r8.mode == AnonymousClass21Z.DELTA && i2 == 429) {
                Log.e("contactsyncmanager/handleSyncContactError/deltaSync need backoff");
                A01 = C56882si.A01(r5);
                str2 = "delta_sync_backoff";
            } else {
                return;
            }
            C18270x1.A0i(A01, str2, A0H);
        }
    }

    public void BF8(C41402Kc r20, String str, int i) {
        ObjectOutputStream objectOutputStream;
        List<Object> list;
        C623734t r5 = this.A00;
        C41402Kc r14 = r20;
        r5.A01 = r14;
        C43922Tz r2 = r14.A00;
        C45902al r13 = r2.A02;
        C45902al r11 = r2.A08;
        C45902al r7 = r2.A09;
        C45902al r8 = r2.A07;
        C45902al r9 = r2.A01;
        C45902al r10 = r2.A03;
        C45902al r12 = r2.A06;
        C45902al r17 = r2.A04;
        C45902al r6 = r2.A05;
        C45902al r4 = r2.A00;
        C45902al r3 = r2.A0A;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("sync/result sid=");
        A0o.append(str);
        A0o.append(" index=");
        A0o.append(0);
        A0o.append(" users_count=");
        AnonymousClass2UJ[] r0 = r14.A01;
        AnonymousClass2UJ[] r16 = r0;
        int length = r0.length;
        int i2 = length;
        A0o.append(length);
        A0o.append(" version=");
        StringBuilder A0A = C18330xA.A0A(AnonymousClass000.A0X(r2.A0C, A0o));
        if (r13 != null) {
            A0A.append(" contact=");
            A0A.append(r13);
            Long l = r13.A02;
            if (l != null) {
                C56882si r142 = r5.A0A;
                C18270x1.A0i(C56882si.A01(r142), "contact_full_sync_wait", l.longValue());
            }
            Long l2 = r13.A01;
            if (l2 != null) {
                C18270x1.A0i(C56882si.A01(r5.A0A), "contact_sync_backoff", A00(r5, l2));
            }
        }
        if (r11 != null) {
            A0A.append(" sidelist=");
            A0A.append(r11);
            Long l3 = r11.A02;
            if (l3 != null) {
                C56882si r132 = r5.A0A;
                C18270x1.A0i(C56882si.A01(r132), "sidelist_full_sync_wait", l3.longValue());
            }
            Long l4 = r11.A01;
            if (l4 != null) {
                C18270x1.A0i(C56882si.A01(r5.A0A), "sidelist_sync_backoff", A00(r5, l4));
            }
        }
        if (r7 != null) {
            A0A.append(" status=");
            A0A.append(r7);
            Long l5 = r7.A02;
            if (l5 != null) {
                C56882si r112 = r5.A0A;
                C18270x1.A0i(C56882si.A01(r112), "status_full_sync_wait", l5.longValue());
            }
            Long l6 = r7.A01;
            if (l6 != null) {
                C18270x1.A0i(C56882si.A01(r5.A0A), "status_sync_backoff", A00(r5, l6));
            }
        }
        if (r3 != null) {
            A0A.append(" textStatus=");
            A0A.append(r3);
            Long l7 = r3.A01;
            if (l7 != null) {
                C18270x1.A0i(C56882si.A01(r5.A0A), "text_status_sync_backoff", A00(r5, l7));
            }
        }
        if (r8 != null) {
            A0A.append(" picture=");
            A0A.append(r8);
            Long l8 = r8.A01;
            if (l8 != null) {
                C18270x1.A0i(C56882si.A01(r5.A0A), "picture_sync_backoff", A00(r5, l8));
            }
        }
        if (r9 != null) {
            A0A.append(" business=");
            A0A.append(r9);
            Long l9 = r9.A01;
            if (l9 != null) {
                C18270x1.A0i(C56882si.A01(r5.A0A), "business_sync_backoff", A00(r5, l9));
            }
        }
        if (r10 != null) {
            A0A.append(" devices=");
            A0A.append(r10);
            Long l10 = r10.A01;
            if (l10 != null) {
                C18270x1.A0i(C56882si.A01(r5.A0A), "devices_sync_backoff", A00(r5, l10));
            }
        }
        if (r12 != null) {
            A0A.append(" payment=");
            A0A.append(r12);
            Long l11 = r12.A01;
            if (l11 != null) {
                C18270x1.A0i(C56882si.A01(r5.A0A), "payment_sync_backoff", A00(r5, l11));
            }
        }
        if (r17 != null) {
            A0A.append(" disappearing_mode=");
            C45902al r02 = r17;
            A0A.append(r02);
            Long l12 = r02.A01;
            if (l12 != null) {
                C18270x1.A0i(C56882si.A01(r5.A0A), "disappearing_mode_sync_backoff", A00(r5, l12));
            }
        }
        if (r6 != null) {
            A0A.append(" lid=");
            A0A.append(r6);
            Long l13 = r6.A01;
            if (l13 != null) {
                C18270x1.A0i(C56882si.A01(r5.A0A), "lid_sync_backoff", A00(r5, l13));
            }
        }
        if (r4 != null) {
            A0A.append(" bot=");
            A0A.append(r4);
            Long l14 = r4.A01;
            if (l14 != null) {
                C18270x1.A0i(C56882si.A01(r5.A0A), "bot_sync_backoff", A00(r5, l14));
            }
        }
        C18280x3.A14(A0A);
        C44822Xp r42 = r5.A0B;
        HashSet A002 = r42.A00();
        for (int i3 = 0; i3 < i2; i3++) {
            AnonymousClass2UJ r72 = r16[i3];
            int i4 = r72.A04;
            if (i4 == 3) {
                List list2 = r72.A0K;
                C626936e.A06(list2);
                A002.addAll(list2);
            } else {
                if ((i4 == 1 || i4 == 2) && (list = r72.A0K) != null) {
                    for (Object put : list) {
                        r5.A0T.put(put, r72);
                    }
                }
                UserJid userJid = r72.A0D;
                if (userJid != null) {
                    r5.A0R.put(userJid, r72);
                } else {
                    Log.w("sync/result/no-jid-found");
                }
            }
        }
        try {
            FileOutputStream A0h = AnonymousClass0x9.A0h(AnonymousClass002.A0A(C54292oU.A03(r42.A01), "invalid_numbers"));
            try {
                objectOutputStream = new ObjectOutputStream(A0h);
                r42.A00 = A002;
                objectOutputStream.writeObject(A002);
                objectOutputStream.close();
                A0h.close();
                return;
            } catch (Throwable th) {
                A0h.close();
                throw th;
            }
            throw th;
        } catch (IOException e) {
            Log.e((Throwable) e);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public void BF9(int i, int i2, String str, long j) {
        C623734t r4 = this.A00;
        r4.A02 = AnonymousClass0x2.A0U();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("contactsyncmanager/handleSyncSidelistError/error sid=");
        A0o.append(str);
        A0o.append(" index=");
        A0o.append(0);
        A0o.append(" code=");
        A0o.append(i2);
        C18260x0.A11(" backoff=", A0o, j);
        if (j > 0) {
            C18270x1.A0i(C56882si.A01(r4.A0A), "sidelist_sync_backoff", r4.A0F.A0H() + j);
        }
    }

    public AnonymousClass3F3(C623734t r1) {
        this.A00 = r1;
    }

    public static long A00(C623734t r3, Number number) {
        return r3.A0F.A0H() + number.longValue();
    }
}
