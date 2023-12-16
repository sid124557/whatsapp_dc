package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.jid.UserJid;
import com.whatsapp.location.WaMapView;

/* renamed from: X.4Pb  reason: invalid class name */
public class AnonymousClass4Pb extends FrameLayout implements AnonymousClass4GJ {
    public View A00;
    public FrameLayout A01;
    public ThumbnailButton A02;
    public C105365Uq A03;
    public C116855qy A04;
    public boolean A05;
    public final C56972sr A06;
    public final AnonymousClass5UX A07;
    public final C56612sH A08;
    public final C66473Lo A09;
    public final C621233o A0A;
    public final C28071fd A0B;
    public final WaMapView A0C;

    private void setMessage(C30801n8 r8) {
        long A052;
        AnonymousClass3ZH A012;
        this.A01.setVisibility(0);
        C621233o r1 = this.A0A;
        boolean z = r8.A1J.A02;
        if (z) {
            A052 = r1.A06(r8);
        } else {
            A052 = r1.A05(r8);
        }
        boolean A022 = C106475Zd.A02(this.A08, r8, A052);
        WaMapView waMapView = this.A0C;
        C28071fd r12 = this.A0B;
        waMapView.A02(r12, r8, A022);
        Context context = getContext();
        C56972sr r5 = this.A06;
        View.OnClickListener A002 = C106475Zd.A00(context, r5, r12, r8, A022);
        View view = this.A00;
        view.setOnClickListener(A002);
        C18300x5.A13(getContext(), view, R.string.f11nameremoved);
        ThumbnailButton thumbnailButton = this.A02;
        AnonymousClass5UX r3 = this.A07;
        C105365Uq r2 = this.A03;
        C66473Lo r13 = this.A09;
        if (z) {
            A012 = C86634Kw.A0V(r5);
        } else {
            UserJid A0o = r8.A0o();
            if (A0o != null) {
                A012 = r13.A01(A0o);
            } else {
                r3.A06(thumbnailButton, R.drawable.avatar_contact);
                return;
            }
        }
        r2.A08(thumbnailButton, A012);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A04;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public AnonymousClass4Pb(Context context, C56972sr r3, AnonymousClass5UX r4, C105365Uq r5, C56612sH r6, C66473Lo r7, C621233o r8, C28071fd r9) {
        super(context);
        if (!this.A05) {
            this.A05 = true;
            generatedComponent();
        }
        this.A08 = r6;
        this.A06 = r3;
        this.A0B = r9;
        this.A07 = r4;
        this.A03 = r5;
        this.A0A = r8;
        this.A09 = r7;
        View.inflate(context, R.layout.f8nameremoved, this);
        this.A0C = (WaMapView) C06560Yg.A02(this, R.id.search_map_preview_map);
        this.A00 = C06560Yg.A02(this, R.id.search_map_preview_thumb_button);
        this.A01 = C86654Ky.A0L(this, R.id.search_map_preview_avatar_container);
        this.A02 = C86664Kz.A16(this, R.id.search_map_preview_contact_thumbnail);
    }

    private void setMessage(AnonymousClass1n9 r6) {
        this.A01.setVisibility(8);
        this.A0C.A03(this.A0B, r6);
        if (r6.A01 != 0.0d || r6.A00 != 0.0d) {
            View view = this.A00;
            AnonymousClass54E.A00(view, r6, this, 23);
            C18300x5.A13(getContext(), view, R.string.f11nameremoved);
        }
    }

    public void setMessage(C30361mK r3) {
        this.A0C.setVisibility(0);
        if (r3 instanceof AnonymousClass1n9) {
            setMessage((AnonymousClass1n9) r3);
        } else {
            setMessage((C30801n8) r3);
        }
    }
}
