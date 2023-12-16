package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1qJ  reason: invalid class name and case insensitive filesystem */
public class C32381qJ extends C54952pY implements C85114Ez {
    public static C18390xG A0G;
    public static final AtomicReference A0H = new AtomicReference((Object) null);
    public boolean A00;
    public final Activity A01;
    public final C69263Wi A02;
    public final AnonymousClass2ET A03;
    public final C18760yD A04;
    public final C65203Gp A05;
    public final C85014Ep A06 = new C86564Kp(this, 0);
    public final C56512s6 A07;
    public final C61072zf A08;
    public final C48502f0 A09;
    public final C55272q5 A0A;
    public final C47322d4 A0B;
    public final C183538qC A0C;
    public final AtomicBoolean A0D = new AtomicBoolean(false);
    public final boolean A0E;
    public final boolean A0F;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C32381qJ(android.app.Activity r12, X.C69263Wi r13, X.AnonymousClass2ET r14, X.AnonymousClass0N6 r15, X.C65203Gp r16, X.C56512s6 r17, X.C61072zf r18, X.C48502f0 r19, X.C55272q5 r20, X.C47322d4 r21, X.C66523Lt r22, X.C66423Lj r23, X.C28861ht r24, X.C50602iS r25, X.AnonymousClass4FS r26, X.C183538qC r27, X.C183538qC r28, boolean r29, boolean r30) {
        /*
            r11 = this;
            r4 = r11
            r10 = r27
            r9 = r26
            r5 = r15
            r6 = r22
            r7 = r23
            r8 = r25
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r1 = 0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            r11.A0D = r0
            X.4Kp r0 = new X.4Kp
            r0.<init>(r11, r1)
            r11.A06 = r0
            r11.A02 = r13
            r0 = r18
            r11.A08 = r0
            r0 = r19
            r11.A09 = r0
            r0 = r17
            r11.A07 = r0
            r0 = r20
            r11.A0A = r0
            r11.A01 = r12
            r11.A03 = r14
            r0 = r29
            r11.A0F = r0
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            java.lang.ref.WeakReference r1 = X.AnonymousClass0x9.A14(r12)
            X.0yD r0 = new X.0yD
            r3 = r24
            r0.<init>(r2, r3, r1)
            r11.A04 = r0
            r0 = r16
            r11.A05 = r0
            r0 = r21
            r11.A0B = r0
            r0 = r30
            r11.A0E = r0
            r0 = r28
            r11.A0C = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32381qJ.<init>(android.app.Activity, X.3Wi, X.2ET, X.0N6, X.3Gp, X.2s6, X.2zf, X.2f0, X.2q5, X.2d4, X.3Lt, X.3Lj, X.1ht, X.2iS, X.4FS, X.8qC, X.8qC, boolean, boolean):void");
    }

    public final boolean Ayl() {
        return this.A07.A07(this.A06);
    }

    public Dialog BQM(int i) {
        C19340zH r2;
        int i2;
        int i3;
        int i4;
        if (i != 100) {
            if (i != 101) {
                int i5 = 200;
                if (i != 200) {
                    i5 = 201;
                    if (i != 201) {
                        switch (i) {
                            case 103:
                                Log.i("restore>VerifyMessageStoreHelper/dialog/restore");
                                r2 = AnonymousClass5V0.A00(this.A01);
                                r2.A0U(R.string.f11nameremoved);
                                r2.A0T(R.string.f11nameremoved);
                                C19340zH.A08(r2, this, 16, R.string.f11nameremoved);
                                i3 = R.string.f11nameremoved;
                                i4 = 8;
                                break;
                            case 104:
                                Log.i("restore>VerifyMessageStoreHelper/dialog/groupsync");
                                Activity activity = this.A01;
                                C18390xG r6 = new C18390xG(activity);
                                r6.setTitle(R.string.f11nameremoved);
                                C18320x8.A0w(r6, activity, R.string.f11nameremoved);
                                r6.setIndeterminate(true);
                                r6.setCancelable(false);
                                return r6;
                            case 105:
                                Log.i("restore>VerifyMessageStoreHelper/dialog/restoreduetoerror");
                                StringBuilder A0o = AnonymousClass001.A0o();
                                Activity activity2 = this.A01;
                                AnonymousClass0x2.A0s(activity2, A0o, R.string.f11nameremoved);
                                A0o.append(" ");
                                AnonymousClass0x2.A0s(activity2, A0o, R.string.f11nameremoved);
                                String obj = A0o.toString();
                                r2 = AnonymousClass5V0.A00(activity2);
                                r2.A0U(R.string.f11nameremoved);
                                r2.A0g(obj);
                                C19340zH.A08(r2, this, 9, R.string.f11nameremoved);
                                i3 = R.string.f11nameremoved;
                                i4 = 10;
                                break;
                            case 106:
                                r2 = AnonymousClass5V0.A00(this.A01);
                                r2.A0U(R.string.f11nameremoved);
                                r2.A0T(R.string.f11nameremoved);
                                C19340zH.A08(r2, this, 11, R.string.f11nameremoved);
                                i3 = R.string.f11nameremoved;
                                i4 = 12;
                                break;
                            case 107:
                                Log.i("restore>VerifyMessageStoreHelper/dialog/restorefrombackupduetoerrorcardnotfoundaskretry");
                                StringBuilder A0o2 = AnonymousClass001.A0o();
                                Activity activity3 = this.A01;
                                AnonymousClass0x2.A0s(activity3, A0o2, R.string.f11nameremoved);
                                A0o2.append(" ");
                                boolean A012 = C61072zf.A01();
                                int i6 = R.string.f11nameremoved;
                                if (A012) {
                                    i6 = R.string.f11nameremoved;
                                }
                                AnonymousClass0x2.A0s(activity3, A0o2, i6);
                                String obj2 = A0o2.toString();
                                r2 = AnonymousClass5V0.A00(activity3);
                                r2.A0U(R.string.f11nameremoved);
                                r2.A0g(obj2);
                                C19340zH.A08(r2, this, 14, R.string.f11nameremoved);
                                i3 = R.string.f11nameremoved;
                                i4 = 15;
                                break;
                            case C627136h.A03 /*108*/:
                                Log.i("restore>VerifyMessageStoreHelper/dialog/msgstorenotrestored");
                                r2 = AnonymousClass5V0.A00(this.A01);
                                r2.A0U(R.string.f11nameremoved);
                                r2.A0T(R.string.f11nameremoved);
                                r2.A0Y((DialogInterface.OnClickListener) null, R.string.f11nameremoved);
                                break;
                            default:
                                return null;
                        }
                        C19340zH.A07(r2, this, i4, i3);
                        r2.A0i(false);
                    } else {
                        Log.i("restore>VerifyMessageStoreHelper/dialog/keyserviceunavailable");
                        i2 = R.string.f11nameremoved;
                    }
                } else {
                    Log.i("restore>VerifyMessageStoreHelper/dialog/cannot-connect");
                    i2 = R.string.f11nameremoved;
                }
                r2 = AnonymousClass5V0.A00(this.A01);
                r2.A0T(i2);
                r2.A0i(false);
                r2.A0Y(new AnonymousClass4I4(this, i5, 0), R.string.f11nameremoved);
                r2.A0W(new AnonymousClass4I4(this, i5, 1), R.string.f11nameremoved);
            } else {
                Log.i("restore>VerifyMessageStoreHelper/dialog/msgstoreerror");
                r2 = AnonymousClass5V0.A00(this.A01);
                r2.A0U(R.string.f11nameremoved);
                r2.A0T(R.string.f11nameremoved);
                C19340zH.A08(r2, this, 13, R.string.f11nameremoved);
            }
            return r2.create();
        }
        Log.i("restore>VerifyMessageStoreHelper/dialog/setup");
        Activity activity4 = this.A01;
        C18390xG r1 = new C18390xG(activity4);
        A0G = r1;
        r1.setTitle(activity4.getString(R.string.f11nameremoved));
        C18320x8.A0w(A0G, activity4, R.string.f11nameremoved);
        A0G.setIndeterminate(false);
        A0G.setCancelable(false);
        A0G.setProgressStyle(1);
        return A0G;
    }

    public void BkT(boolean z, boolean z2) {
        String str;
        this.A00 = z;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("restore>VerifyMessageStoreHelper/preparemsgstore isregname=");
        boolean z3 = this.A0F;
        A0o.append(z3);
        A0o.append(" restorefrombackup=");
        A0o.append(z);
        A0o.append(" skipdialog=");
        if (z2) {
            str = "true";
        } else {
            str = "false";
        }
        C18260x0.A1L(A0o, str);
        if (!z2) {
            Activity activity = this.A01;
            if (!activity.isFinishing() && (!z3 || this.A00)) {
                C621433s.A01(activity, 100);
            }
        }
        if (!((AnonymousClass317) this.A06.get()).A0G()) {
            C06270Wx.A04(this.A00, 0);
        } else {
            A00();
        }
    }

    public void BsA() {
        int A0B2 = AnonymousClass0x7.A0N(this.A01).A0B();
        C18260x0.A0y("restore>VerifyMessageStoreHelper/usehistoryifexists/backupfilesfound ", AnonymousClass001.A0o(), A0B2);
        if (A0B2 > 0) {
            C621433s.A01(this.A01, 103);
        } else {
            BkT(false, true);
        }
    }
}
