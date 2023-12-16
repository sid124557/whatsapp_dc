package X;

import android.os.Handler;
import com.whatsapp.util.Log;
import java.util.Objects;

/* renamed from: X.10z  reason: invalid class name */
public class AnonymousClass10z extends C05550Ty {
    public final Handler A00 = AnonymousClass000.A0A();
    public final C06270Wx A01;
    public final AnonymousClass08J A02;
    public final AnonymousClass08M A03;
    public final AnonymousClass08M A04;
    public final C105275Ug A05;
    public final AnonymousClass33p A06;
    public final C72303dV A07;
    public final AnonymousClass2QW A08;
    public final AnonymousClass2I2 A09;
    public final C32361qH A0A;
    public final C53282mq A0B;
    public final C29191iQ A0C;
    public final Runnable A0D = new C71543cH((Object) this, 36);

    public final void A0G(int i, int i2) {
        if (i == 1) {
            this.A08.A01.A04 = Integer.valueOf(i2);
        } else if (i == 2) {
            this.A08.A01.A07 = Integer.valueOf(i2);
        } else if (i == 3) {
            this.A08.A01.A08 = Integer.valueOf(i2);
        }
    }

    public AnonymousClass10z(C105275Ug r20, AnonymousClass0N6 r21, AnonymousClass33p r22, C72303dV r23, C66523Lt r24, C66423Lj r25, C50602iS r26, AnonymousClass317 r27, AnonymousClass2QW r28, C53282mq r29, C29191iQ r30, C619632y r31, AnonymousClass1R1 r32, C623834u r33, C23021Qz r34, AnonymousClass4FS r35) {
        AnonymousClass08J r4 = new AnonymousClass08J();
        this.A02 = r4;
        AnonymousClass2I2 r3 = new AnonymousClass2I2(this);
        this.A09 = r3;
        AnonymousClass08M A012 = AnonymousClass08M.A01();
        this.A03 = A012;
        this.A05 = r20;
        this.A07 = r23;
        this.A06 = r22;
        AnonymousClass2QW r11 = r28;
        this.A08 = r11;
        this.A0B = r29;
        C29191iQ r5 = r30;
        this.A0C = r5;
        AnonymousClass0N6 r7 = r21;
        C623834u r15 = r33;
        C66523Lt r8 = r24;
        C66423Lj r9 = r25;
        C50602iS r10 = r26;
        C32361qH r6 = new C32361qH(r7, r8, r9, r10, r11, this, r31, r32, r15, r34, r35, new C72333dY(r27, (AnonymousClass4C1) null));
        this.A0A = r6;
        AnonymousClass08M r1 = r6.A00;
        this.A01 = r1;
        AnonymousClass4K2.A01(r1, r4, this, 184);
        Objects.requireNonNull(r4);
        r4.A0J(A012, new AnonymousClass4K2(r4, 28));
        this.A04 = AnonymousClass08M.A01();
        r5.A06(r3);
        A0D();
    }

    public void A0C() {
        Log.i("DirectTransferBackgroundTaskViewModel/removeAllListener");
        this.A00.removeCallbacks(this.A0D);
        AnonymousClass08J r1 = this.A02;
        r1.A0I(this.A03);
        r1.A0I(this.A01);
        this.A0C.A07(this.A09);
    }

    public final void A0D() {
        if (C72303dV.A00(this.A07)) {
            Log.i("DirectTransferBackgroundTaskViewModel/msg-store-is-already-ready");
            A0G(C18280x3.A02(AnonymousClass0x2.A0F(this.A06), "migrate_from_other_app_attempt_count"), 2);
            A0F(6);
            return;
        }
        AnonymousClass33p r4 = this.A06;
        C18270x1.A0h(C18270x1.A03(r4), "migrate_from_other_app_attempt_count", C18280x3.A02(AnonymousClass0x2.A0F(r4), "migrate_from_other_app_attempt_count") + 1);
        A0E();
        Integer num = 1;
        if (!num.equals(this.A03.A07())) {
            Log.i("DirectTransferBackgroundTaskViewModel/startBackgroundTaskAfterOtherAppIsLoggedOut/start-background-task");
            A0F(1);
            C32361qH r1 = this.A0A;
            if (!((AnonymousClass317) r1.A06.get()).A0G()) {
                C06270Wx.A04(r1.A00, 0);
            } else {
                r1.A00();
            }
        }
    }

    public final void A0E() {
        int i = AnonymousClass0x2.A0F(this.A06).getInt("direct_db_migration_timeout_in_secs", 360);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("DirectTransferBackgroundTaskViewModel/setupTimeout/timeout =");
        long A0A2 = C18290x4.A0A(i);
        C18260x0.A1I(A0o, A0A2);
        if (i > 0) {
            this.A00.postDelayed(this.A0D, A0A2);
        }
    }

    public final void A0F(int i) {
        switch (i) {
            case 1:
            case 2:
            case 7:
                break;
            default:
                if (C18280x3.A02(AnonymousClass0x2.A0F(this.A06), "migrate_from_other_app_attempt_count") >= 3) {
                    A0F(7);
                    return;
                }
                break;
        }
        C06270Wx.A04(this.A03, i);
    }
}
