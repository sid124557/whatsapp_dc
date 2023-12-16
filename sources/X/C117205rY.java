package X;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import androidx.core.app.NotificationCompat$BigTextStyle;
import com.whatsapp.R;
import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.qrcode.contactqr.ContactQrContactCardView;
import com.whatsapp.qrcode.contactqr.ContactQrMyCodeFragment;
import java.util.ArrayList;

/* renamed from: X.5rY  reason: invalid class name and case insensitive filesystem */
public class C117205rY implements Runnable {
    public int A00;
    public Object A01;
    public String A02;
    public final int A03;

    public C117205rY(Object obj, String str, int i, int i2) {
        this.A03 = i2;
        this.A01 = obj;
        this.A00 = i;
        this.A02 = str;
    }

    public final void run() {
        long j;
        int i;
        AnonymousClass4UC r2;
        int i2;
        ArrayList arrayList;
        int i3;
        switch (this.A03) {
            case 0:
                AnonymousClass4U1 r4 = (AnonymousClass4U1) this.A01;
                int i4 = this.A00;
                String str = this.A02;
                if (i4 == -1) {
                    r4.A05.A0G(C162197rQ.newArrayList((Object[]) new C136186lz[]{new C132496fR(r4, str, 2)}));
                    return;
                } else if (i4 == 1 || i4 == 2 || i4 == 3) {
                    r4.A05.A0G(C162197rQ.newArrayList((Object[]) new C136186lz[]{new C132496fR(r4, str, 3)}));
                    if (r4.A0A.A00(r4.A0J)) {
                        r4.A0F.A01(0, -1, -1);
                        return;
                    }
                    return;
                } else if (i4 == 4) {
                    r2 = r4.A0I;
                    i2 = 1;
                    break;
                } else {
                    return;
                }
                break;
            case 1:
                BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = (BusinessDirectoryContextualSearchViewModel) this.A01;
                int i5 = this.A00;
                String str2 = this.A02;
                businessDirectoryContextualSearchViewModel.A0B.removeCallbacks(businessDirectoryContextualSearchViewModel.A06);
                if (i5 == -1) {
                    businessDirectoryContextualSearchViewModel.A0W.A07();
                    arrayList = AnonymousClass002.A0J(businessDirectoryContextualSearchViewModel.A0G());
                    i3 = 1;
                } else if (i5 == 1 || i5 == 2 || i5 == 3) {
                    businessDirectoryContextualSearchViewModel.A0W.A07();
                    arrayList = AnonymousClass002.A0J(businessDirectoryContextualSearchViewModel.A0G());
                    i3 = 2;
                } else if (i5 == 4) {
                    C111525iE r3 = businessDirectoryContextualSearchViewModel.A0M;
                    C95224sp r1 = new C95224sp();
                    C95224sp.A01(r1, 46);
                    r1.A0I = AnonymousClass0x2.A0U();
                    r1.A0D = 6;
                    r3.A04(r1);
                    r2 = businessDirectoryContextualSearchViewModel.A0j;
                    i2 = C18280x3.A0S();
                    break;
                } else {
                    return;
                }
                arrayList.add(new C136016li(businessDirectoryContextualSearchViewModel, str2, i3));
                C111525iE r32 = businessDirectoryContextualSearchViewModel.A0M;
                Integer valueOf = Integer.valueOf(i3);
                C95224sp r12 = new C95224sp();
                C95224sp.A01(r12, 46);
                r12.A0I = AnonymousClass0x2.A0U();
                r12.A0D = valueOf;
                r32.A04(r12);
                businessDirectoryContextualSearchViewModel.A0F.A0G(arrayList);
                return;
            case 2:
                ((AnonymousClass4AR) this.A01).BS0(this.A00, this.A02);
                return;
            case 3:
                C104705Sa r7 = (C104705Sa) this.A01;
                String str3 = this.A02;
                int i6 = this.A00;
                AnonymousClass7LG r13 = (AnonymousClass7LG) r7.A03.get(str3);
                if (r13 != null) {
                    int i7 = r13.A01;
                    int i8 = r13.A00;
                    UserJid userJid = r13.A02;
                    Integer A002 = C159477lu.A00(i7);
                    if (A002 != null) {
                        AnonymousClass2QO r22 = new AnonymousClass2QO(userJid, "smax", false, false);
                        C54712pA r14 = r7.A01;
                        int intValue = A002.intValue();
                        if (i6 == 0) {
                            r14.A02(r22, intValue, i8);
                            return;
                        } else {
                            r14.A01(r22, intValue, i8);
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 4:
                C97644yu r42 = (C97644yu) this.A01;
                String str4 = this.A02;
                int i9 = this.A00;
                r42.A0Z = false;
                r42.BjL();
                if (str4 != null) {
                    r42.A0W = str4;
                    ContactQrMyCodeFragment contactQrMyCodeFragment = r42.A0T;
                    if (contactQrMyCodeFragment != null) {
                        contactQrMyCodeFragment.A02 = str4;
                        ContactQrContactCardView contactQrContactCardView = contactQrMyCodeFragment.A01;
                        if (contactQrContactCardView != null) {
                            contactQrContactCardView.setQrCode(AnonymousClass000.A0V("https://wa.me/qr/", str4, AnonymousClass001.A0o()));
                        }
                    }
                    if (r42.A01) {
                        i = R.string.f11nameremoved;
                    } else {
                        return;
                    }
                } else if (i9 != 0) {
                    boolean z = r42.A01;
                    i = R.string.f11nameremoved;
                    if (!z) {
                        r42.A6a(new C1892490o(r42, 4), new C1892490o(r42, 3), R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved);
                        return;
                    }
                } else if (r42.A0W == null) {
                    r42.A05.A0H(R.string.f11nameremoved, 1);
                    return;
                } else {
                    return;
                }
                r42.Bot(i);
                return;
            case 5:
                String str5 = this.A02;
                int i10 = this.A00;
                C97644yu r23 = (C97644yu) ((C115285oQ) this.A01).A02.A02.get();
                if (r23 != null) {
                    if (!(str5 == null && i10 == 0)) {
                        C18270x1.A0j(AnonymousClass4SG.A2P(r23), "contact_qr_code", str5);
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime() - r23.A00;
                    C69263Wi r43 = r23.A05;
                    C117205rY r33 = new C117205rY(r23, str5, i10, 4);
                    if (elapsedRealtime < 500) {
                        j = 500 - elapsedRealtime;
                    } else {
                        j = 0;
                    }
                    r43.A0T(r33, j);
                    return;
                }
                return;
            default:
                AnonymousClass1gK r15 = (AnonymousClass1gK) this.A01;
                int i11 = this.A00;
                String str6 = this.A02;
                C41902Ma r5 = (C41902Ma) r15.A07.get();
                Context context = r15.A00.A00;
                C162457s7.A0D(context);
                Intent A0C = C86634Kw.A0C(context);
                A0C.putExtra("target_settings_wfal", true);
                Context context2 = r5.A00.A00;
                C05610Ue r24 = new C05610Ue(context2, "critical_app_alerts@1");
                r24.A02(3);
                r24.A0E(true);
                r24.A0B((CharSequence) null);
                r24.A0A(str6);
                r24.A07.icon = R.drawable.notifybar;
                NotificationCompat$BigTextStyle notificationCompat$BigTextStyle = new NotificationCompat$BigTextStyle();
                notificationCompat$BigTextStyle.A07(str6);
                r24.A08(notificationCompat$BigTextStyle);
                r24.A09 = C624735e.A00(context2, 0, A0C, 0);
                r24.A03 = 0;
                r5.A01.A04(i11, r24.A01());
                return;
        }
        r2.A0G(i2);
    }
}
