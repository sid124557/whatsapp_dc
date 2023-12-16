package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

@Deprecated
/* renamed from: X.4Yw  reason: invalid class name and case insensitive filesystem */
public class C88474Yw extends C05570Ua {
    public int A00 = R.string.f11nameremoved;
    public int A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public UserJid A06;
    public final Context A07;
    public final Resources A08;
    public final FrameLayout A09;
    public final ImageView A0A;
    public final ImageView A0B;
    public final ImageView A0C;
    public final TextView A0D;
    public final C64333Db A0E;
    public final C69263Wi A0F;
    public final AnonymousClass5YB A0G;
    public final C105365Uq A0H;
    public final C69273Wj A0I;
    public final AnonymousClass4FS A0J;
    public final C156257gJ A0K = new C139996sz();
    public final boolean A0L;

    public C88474Yw(Context context, View view, C64333Db r8, C105365Uq r9) {
        super(view);
        this.A07 = context;
        this.A08 = context.getResources();
        this.A0E = r8;
        this.A0F = C64333Db.A04(r8);
        this.A0J = r8.BsP();
        this.A0I = new C69273Wj(context);
        this.A0H = r9;
        boolean A0X = r8.Avy().A0X(2429);
        this.A0L = r8.Avy().A0Y(C58422vE.A01, 1875);
        ImageView A0E2 = AnonymousClass0x9.A0E(view, R.id.contact_photo);
        ImageView A0E3 = AnonymousClass0x9.A0E(view, R.id.wdsProfilePicture);
        if (A0X) {
            A0E2.setVisibility(8);
            A0E3.setVisibility(0);
        } else {
            A0E2.setVisibility(0);
            A0E3.setVisibility(8);
            A0E3 = A0E2;
        }
        this.A0C = A0E3;
        A0E3.setClickable(false);
        A0E3.setImportantForAccessibility(2);
        C06560Yg.A02(view, R.id.contact_selector).setClickable(false);
        AnonymousClass5YB A002 = AnonymousClass5YB.A00(view, C86614Ku.A0N(r8), R.id.contact_name);
        this.A0G = A002;
        this.A0D = C18300x5.A0G(view, R.id.date_time);
        this.A09 = C86654Ky.A0L(view, R.id.action);
        this.A0A = AnonymousClass0x9.A0E(view, R.id.action_icon);
        this.A0B = AnonymousClass0x9.A0E(view, R.id.contact_mark);
        C106905aM.A04(A002.A02);
    }
}
