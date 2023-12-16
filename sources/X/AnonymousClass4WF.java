package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VoipCallControlBottomSheetV2;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4WF  reason: invalid class name */
public class AnonymousClass4WF extends AnonymousClass09G {
    public static final AnonymousClass6HF A0D = new AnonymousClass6HF();
    public RecyclerView A00;
    public AnonymousClass64J A01;
    public ParticipantsListViewModel A02;
    public C64773Ex A03;
    public AnonymousClass5ZU A04;
    public C620633i A05;
    public C620733j A06;
    public C66493Lq A07;
    public UserJid A08;
    public C56572sD A09;
    public C147487Em A0A;
    public final C184288rY A0B;
    public final C105365Uq A0C;

    public AnonymousClass4WF(Context context, AnonymousClass5UX r3, C114015mM r4) {
        super((AnonymousClass0O4) A0D);
        this.A0B = new AnonymousClass3Ey(r3);
        this.A0C = r4.A06(context, "voip-call-control-bottom-sheet");
        A0E(true);
    }

    public void A0D(RecyclerView recyclerView) {
        Log.i("voip/ParticipantsListAdapter/onDetachedFromRecyclerView");
        this.A0C.A00();
    }

    public /* bridge */ /* synthetic */ void A0J(C05570Ua r1) {
        ((AnonymousClass6J6) r1).A07();
    }

    public void A0L(List list) {
        ArrayList A0J;
        if (list == null) {
            A0J = null;
        } else {
            A0J = AnonymousClass002.A0J(list);
        }
        super.A0L(A0J);
    }

    public void A0M() {
        if (this.A00 != null) {
            for (int i = 0; i < A0G(); i++) {
                C152087Xm r2 = (C152087Xm) super.A0K(i);
                if (r2.A00 == 4) {
                    C05570Ua A0F = this.A00.A0F(i);
                    if (A0F instanceof AnonymousClass6J6) {
                        ((AnonymousClass6J6) A0F).A08(r2);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final void A0N(int i) {
        C147487Em r0 = this.A0A;
        if (r0 != null) {
            VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = r0.A00;
            if (voipCallControlBottomSheetV2.A0G != null && voipCallControlBottomSheetV2.A0F != null) {
                C18260x0.A0y("voip/VoipCallControlBottomSheetV2 scroll to position: ", AnonymousClass001.A0o(), i);
                voipCallControlBottomSheetV2.A0O.A08 = null;
                voipCallControlBottomSheetV2.A0G.post(new C71563cJ((Object) voipCallControlBottomSheetV2, i, 22));
            }
        }
    }

    public void A0O(UserJid userJid) {
        this.A08 = userJid;
        if (userJid != null) {
            for (int i = 0; i < A0G(); i++) {
                C152087Xm r1 = (C152087Xm) super.A0K(i);
                if ((r1 instanceof C132786fx) && ((C132786fx) r1).A02.equals(this.A08)) {
                    A0N(i);
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r3, int i) {
        C152087Xm r1 = (C152087Xm) super.A0K(i);
        C626936e.A06(r1);
        ((AnonymousClass6J6) r3).A08(r1);
        if ((r1 instanceof C132786fx) && ((C132786fx) r1).A02.equals(this.A08)) {
            A0N(i);
        }
    }

    public long A0B(int i) {
        int i2;
        C152087Xm r1 = (C152087Xm) super.A0K(i);
        if (r1 instanceof C132786fx) {
            i2 = ((C132786fx) r1).A02.hashCode();
        } else {
            i2 = r1.A00;
        }
        return (long) i2;
    }

    public void A0C(RecyclerView recyclerView) {
        this.A00 = recyclerView;
    }

    public /* bridge */ /* synthetic */ Object A0K(int i) {
        return super.A0K(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        r5 = (X.C91324jN) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0P(com.whatsapp.jid.UserJid r8) {
        /*
            r7 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/ParticipantsListAdapter/updateProfilePhoto "
            X.C18260x0.A1R(r1, r0, r8)
            r6 = 0
        L_0x000a:
            int r0 = r7.A0G()
            if (r6 >= r0) goto L_0x0047
            java.lang.Object r1 = super.A0K(r6)
            X.7Xm r1 = (X.C152087Xm) r1
            boolean r0 = r1 instanceof X.C132786fx
            if (r0 == 0) goto L_0x0044
            androidx.recyclerview.widget.RecyclerView r0 = r7.A00
            if (r0 == 0) goto L_0x0044
            X.6fx r1 = (X.C132786fx) r1
            com.whatsapp.jid.UserJid r0 = r1.A02
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0044
            androidx.recyclerview.widget.RecyclerView r0 = r7.A00
            X.0Ua r5 = r0.A0F(r6)
            boolean r0 = r5 instanceof X.C91324jN
            if (r0 == 0) goto L_0x0044
            X.4jN r5 = (X.C91324jN) r5
            X.6fx r0 = r5.A00
            if (r0 == 0) goto L_0x0044
            X.5Uq r4 = r5.A08
            X.3ZH r3 = r0.A01
            android.widget.ImageView r2 = r5.A02
            r1 = 1
            X.8rY r0 = r5.A07
            r4.A05(r2, r0, r3, r1)
        L_0x0044:
            int r6 = r6 + 1
            goto L_0x000a
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4WF.A0P(com.whatsapp.jid.UserJid):void");
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        LayoutInflater A0D2 = C18280x3.A0D(viewGroup);
        if (i == 0) {
            return new C91264jH(A0D2.inflate(R.layout.f8nameremoved, viewGroup, false), this.A02);
        }
        if (i == 2) {
            return new C91274jI(A0D2.inflate(R.layout.f8nameremoved, viewGroup, false), this.A02);
        }
        if (i == 4) {
            return new C91314jM(A0D2.inflate(R.layout.f8nameremoved, viewGroup, false), this.A02, this.A03, this.A04, this.A07, this.A09);
        } else if (i == 5) {
            return new C91304jL(A0D2.inflate(R.layout.f8nameremoved, viewGroup, false), this.A02);
        } else {
            if (i == 6) {
                return new C91284jJ(A0D2.inflate(R.layout.f8nameremoved, viewGroup, false), this.A02);
            }
            if (i == 7) {
                return new C91294jK(A0D2.inflate(R.layout.f8nameremoved, viewGroup, false), this.A02);
            }
            C626936e.A0D(AnonymousClass001.A1T(i), "Unknown list item type");
            View inflate = A0D2.inflate(R.layout.f8nameremoved, viewGroup, false);
            ParticipantsListViewModel participantsListViewModel = this.A02;
            AnonymousClass5ZU r6 = this.A04;
            C620633i r9 = this.A05;
            return new C91324jN(inflate, this.A01, participantsListViewModel, r6, this.A0B, this.A0C, r9);
        }
    }

    public int getItemViewType(int i) {
        C152087Xm r0 = (C152087Xm) super.A0K(i);
        C626936e.A06(r0);
        return r0.A00;
    }
}
