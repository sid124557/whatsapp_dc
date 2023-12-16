package X;

import android.content.Context;
import android.widget.LinearLayout;
import com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView;

/* renamed from: X.4Qt  reason: invalid class name and case insensitive filesystem */
public abstract class C87414Qt extends LinearLayout implements AnonymousClass4GJ {
    public C116855qy A00;

    public static void A01(C98044zj r2, VoiceNoteProfileAvatarView voiceNoteProfileAvatarView) {
        AnonymousClass2z0 r0 = r2.A09.A1J;
        voiceNoteProfileAvatarView.A04(0, false, r0.A02, C627336j.A0K(r0.A00));
    }

    public void A02() {
        if (this instanceof C97924zW) {
            C97924zW r2 = (C97924zW) this;
            if (!r2.A0C) {
                r2.A0C = true;
                C88864av r4 = (C88864av) ((C111685iW) r2.generatedComponent());
                C64333Db r3 = r4.A0K;
                r2.A05 = C64333Db.A4B(r3);
                C107695bk A002 = A00(r3, r2, r3.AK5);
                r2.A00 = C64333Db.A06(r3);
                r2.A02 = C64333Db.A29(r3);
                r2.A01 = C64333Db.A26(r3);
                r2.A05 = C64333Db.A2t(r3);
                r2.A06 = (C54602oz) r3.ABK.get();
                r2.A0B = C72343dZ.A00(A002.A9k);
                r2.A07 = (C182938pE) r4.A0B.get();
                r2.A03 = C107695bk.A17(A002);
            }
        } else if (this instanceof AnonymousClass4zX) {
            AnonymousClass4zX r22 = (AnonymousClass4zX) this;
            if (!r22.A0C) {
                r22.A0C = true;
                C88864av r42 = (C88864av) ((C111685iW) r22.generatedComponent());
                C64333Db r32 = r42.A0K;
                r22.A05 = C64333Db.A4B(r32);
                C107695bk A003 = A00(r32, r22, r32.AK5);
                r22.A00 = C64333Db.A06(r32);
                r22.A02 = C64333Db.A29(r32);
                r22.A01 = C64333Db.A26(r32);
                r22.A05 = C64333Db.A2t(r32);
                r22.A06 = (C54602oz) r32.ABK.get();
                r22.A0B = C72343dZ.A00(A003.A9k);
                r22.A07 = (C182938pE) r42.A0B.get();
                r22.A03 = C107695bk.A17(A003);
            }
        } else {
            AnonymousClass4zV r33 = (AnonymousClass4zV) this;
            if (!r33.A05) {
                r33.A05 = true;
                C64333Db A004 = C88864av.A00(r33.generatedComponent());
                r33.A05 = C64333Db.A4B(A004);
                C107695bk A005 = A00(A004, r33, A004.AK5);
                r33.A02 = C64333Db.A2t(A004);
                r33.A01 = C107695bk.A17(A005);
                r33.A04 = C72343dZ.A00(A005.A9k);
            }
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A00;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C87414Qt(Context context) {
        super(context);
        A02();
    }

    public static C107695bk A00(C64333Db r2, C98044zj r3, AnonymousClass4C1 r4) {
        r3.A0A = (C105025Tg) r4.get();
        r3.A00 = (C69263Wi) r2.AG7.get();
        r3.A01 = (AnonymousClass5Ul) r2.AUW.get();
        r3.A02 = (C621033m) r2.AZL.get();
        r3.A0B = (C33141sV) r2.AMe.get();
        r3.A04 = (AnonymousClass5ZR) r2.Aag.get();
        r3.A07 = (C620133d) r2.AJf.get();
        C107695bk r1 = r2.A00;
        r3.A08 = (C104295Qk) r1.A7E.get();
        r3.A03 = (C113895mA) r2.AKl.get();
        r3.A06 = (C56232re) r2.AUV.get();
        r3.A0C = C72343dZ.A00(r1.A8T);
        return r1;
    }
}
