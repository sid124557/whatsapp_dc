package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.Map;

/* renamed from: X.9dg  reason: invalid class name and case insensitive filesystem */
public final class C197669dg implements AnonymousClass4DR {
    public final AnonymousClass5ZU A00;
    public final C613330g A01;
    public final C54292oU A02;
    public final AnonymousClass9U4 A03;

    public /* bridge */ /* synthetic */ Object Bk2(Enum enumR, Object obj, Map map) {
        AnonymousClass3ZH r7 = (AnonymousClass3ZH) obj;
        AnonymousClass9KB r6 = (AnonymousClass9KB) enumR;
        boolean A1Y = AnonymousClass0x2.A1Y(r7, r6);
        int ordinal = r6.ordinal();
        if (ordinal == 0) {
            return this.A00.A0H(r7);
        }
        if (ordinal == A1Y) {
            C613330g r4 = this.A01;
            Context context = this.A02.A00;
            Bitmap A012 = r4.A01(context, r7, context.getResources().getDimension(R.dimen.f6nameremoved), context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
            if (A012 != null) {
                return C107245ax.A07(A012);
            }
            return C107245ax.A07(BitmapFactory.decodeResource(context.getResources(), R.drawable.avatar_contact));
        } else if (ordinal == 2) {
            UserJid A07 = AnonymousClass3ZH.A07(r7);
            if (A07 != null) {
                return AnonymousClass9U4.A03(this.A03).A05(A07);
            }
            return null;
        } else {
            throw new C73153f1();
        }
    }

    public C197669dg(AnonymousClass5ZU r1, C613330g r2, C54292oU r3, AnonymousClass9U4 r4) {
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
    }

    public Class B3E() {
        return AnonymousClass9KB.class;
    }
}
