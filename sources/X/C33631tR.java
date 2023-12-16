package X;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1tR  reason: invalid class name and case insensitive filesystem */
public class C33631tR extends AnonymousClass5ZM {
    public int A00;
    public AnonymousClass5L8 A01;
    public final C56612sH A02;
    public final C66493Lq A03;
    public final C66503Lr A04;
    public final AnonymousClass31C A05;
    public final String A06;
    public final WeakReference A07;

    public C33631tR(AcceptInviteLinkActivity acceptInviteLinkActivity, C56612sH r3, C66493Lq r4, C66503Lr r5, AnonymousClass31C r6, String str) {
        super(acceptInviteLinkActivity, true);
        this.A02 = r3;
        this.A05 = r6;
        this.A03 = r4;
        this.A04 = r5;
        this.A07 = AnonymousClass0x9.A14(acceptInviteLinkActivity);
        this.A06 = str;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        try {
            this.A05.A08(32000);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                this.A04.A03(new AnonymousClass4JI(this, 0), this.A06).get(32000, TimeUnit.MILLISECONDS);
                long A0E = AnonymousClass0x7.A0E(elapsedRealtime);
                if (A0E < 500) {
                    SystemClock.sleep(500 - A0E);
                    return null;
                }
            } catch (Exception e) {
                Log.w("acceptlink/failed/timeout", e);
            }
        } catch (C376223j unused) {
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        boolean z;
        int i;
        Drawable r0;
        AcceptInviteLinkActivity acceptInviteLinkActivity = (AcceptInviteLinkActivity) this.A07.get();
        if (acceptInviteLinkActivity != null) {
            String str = this.A06;
            AnonymousClass5L8 r4 = this.A01;
            int i2 = this.A00;
            if (r4 != null) {
                C56072rN r02 = acceptInviteLinkActivity.A0J;
                int i3 = r4.A02;
                if (r02.A03(i3)) {
                    View A002 = C005205m.A00(acceptInviteLinkActivity, R.id.group_photo_container);
                    ThumbnailButton thumbnailButton = (ThumbnailButton) C005205m.A00(acceptInviteLinkActivity, R.id.group_photo);
                    C59862xc r6 = acceptInviteLinkActivity.A0D;
                    ColorDrawable colorDrawable = new ColorDrawable(C06400Xn.A00(acceptInviteLinkActivity.getTheme(), acceptInviteLinkActivity.getResources(), AnonymousClass5Yj.A02(acceptInviteLinkActivity, R.attr.f3nameremoved, R.color.f5nameremoved)));
                    AnonymousClass922 r7 = new AnonymousClass922(1);
                    if (r6.A00.A0Y(C58422vE.A02, 1257)) {
                        r0 = new C86824Lz(colorDrawable, r7);
                    } else {
                        r0 = new AnonymousClass4M0(colorDrawable, r7);
                    }
                    A002.setBackground(r0);
                    thumbnailButton.A06 = new AnonymousClass922(1);
                }
                C56982ss r03 = acceptInviteLinkActivity.A08;
                C27991fJ r62 = r4.A05;
                if (!r03.A0L(r62) || !acceptInviteLinkActivity.A0A.A0C(r62)) {
                    boolean BHW = acceptInviteLinkActivity.BHW();
                    StringBuilder A0o = AnonymousClass001.A0o();
                    if (!BHW) {
                        C18260x0.A1R(A0o, "acceptlink/processcode/showconfirmation/", r62);
                        z = false;
                    } else {
                        C18260x0.A1R(A0o, "acceptlink/processcode/activityended/", r62);
                        return;
                    }
                } else {
                    C18260x0.A1R(AnonymousClass001.A0o(), "acceptlink/processcode/exists/", r62);
                    boolean A032 = acceptInviteLinkActivity.A0J.A03(i3);
                    C69263Wi r1 = acceptInviteLinkActivity.A05;
                    int i4 = R.string.f11nameremoved;
                    if (A032) {
                        i4 = R.string.f11nameremoved;
                    }
                    z = true;
                    r1.A0H(i4, 1);
                }
                acceptInviteLinkActivity.A0H.A01(r4, 0);
                AnonymousClass31C r12 = acceptInviteLinkActivity.A0I;
                AnonymousClass3P6 r04 = new AnonymousClass3P6(acceptInviteLinkActivity);
                String A033 = r12.A03();
                AnonymousClass31C r11 = r12;
                r11.A0D(new AnonymousClass3T2(r04, (GroupJid) null, (GroupJid) null, "preview", (String) null), AnonymousClass27I.A00((GroupJid) null, (GroupJid) null, A033, "blob", "preview", (String) null, str), A033, 300, 32000);
                TextView A012 = C005205m.A01(acceptInviteLinkActivity, R.id.invite_accept);
                if (z) {
                    i = R.string.f11nameremoved;
                } else {
                    boolean A034 = acceptInviteLinkActivity.A0J.A03(i3);
                    i = R.string.f11nameremoved;
                    if (A034) {
                        i = R.string.f11nameremoved;
                    }
                }
                A012.setText(i);
                A012.setOnClickListener(new C634639i(acceptInviteLinkActivity, r4, str, z));
                acceptInviteLinkActivity.A74();
                return;
            }
            C18260x0.A0x("acceptlink/processcode/failed/", AnonymousClass001.A0o(), i2);
            int i5 = R.string.f11nameremoved;
            if (i2 != 0) {
                i5 = R.string.f11nameremoved;
                if (i2 != 401) {
                    i5 = R.string.f11nameremoved;
                    if (i2 != 404) {
                        i5 = R.string.f11nameremoved;
                        if (i2 != 406) {
                            i5 = R.string.f11nameremoved;
                            if (i2 != 410) {
                                i5 = R.string.f11nameremoved;
                                if (i2 != 419) {
                                    i5 = R.string.f11nameremoved;
                                    if (i2 == 436) {
                                        acceptInviteLinkActivity.A75(R.string.f11nameremoved);
                                        acceptInviteLinkActivity.findViewById(R.id.learn_more).setVisibility(0);
                                        acceptInviteLinkActivity.findViewById(R.id.learn_more).setOnClickListener(new AnonymousClass54G(acceptInviteLinkActivity));
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            acceptInviteLinkActivity.A75(i5);
        }
    }
}
