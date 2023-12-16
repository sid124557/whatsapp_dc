package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.94N  reason: invalid class name */
public class AnonymousClass94N extends LinearLayout implements AnonymousClass4GJ {
    public View A00;
    public View A01;
    public Button A02;
    public ImageView A03;
    public TextView A04;
    public C116855qy A05;
    public boolean A06;

    public void setAlertType(int i) {
        Context context;
        int i2;
        Context context2;
        int i3;
        Resources resources;
        int i4;
        String string;
        if (i != 0) {
            if (i == 2) {
                setAlertButtonVisibility(8);
                setAlertMessageText(getContext().getString(R.string.f11nameremoved));
                resources = getResources();
                i4 = R.drawable.ic_settings_info;
            } else if (i != 3) {
                if (i != 4) {
                    setAlertButtonVisibility(0);
                    setAlertButtonText(getContext().getString(R.string.f11nameremoved));
                    string = getContext().getString(R.string.f11nameremoved);
                } else {
                    setAlertButtonVisibility(0);
                    setAlertButtonText(getResources().getString(R.string.f11nameremoved));
                    string = getResources().getString(R.string.f11nameremoved);
                }
                setAlertMessageText(string);
                resources = getResources();
                i4 = R.drawable.ic_settings_secure;
            } else {
                setAlertButtonVisibility(0);
                setAlertButtonText(getContext().getString(R.string.f11nameremoved));
                context = getContext();
                i2 = R.string.f11nameremoved;
                setAlertMessageText(context.getString(i2));
                setAlertIcon(getResources().getDrawable(R.drawable.ic_settings_warning));
                context2 = getContext();
                i3 = R.color.f5nameremoved;
            }
            setAlertIcon(resources.getDrawable(i4));
            context2 = getContext();
            i3 = R.color.f5nameremoved;
        } else {
            setAlertButtonVisibility(0);
            setAlertButtonText(getContext().getString(R.string.f11nameremoved));
            context = getContext();
            i2 = R.string.f11nameremoved;
            setAlertMessageText(context.getString(i2));
            setAlertIcon(getResources().getDrawable(R.drawable.ic_settings_warning));
            context2 = getContext();
            i3 = R.color.f5nameremoved;
        }
        setAlertIconTint(AnonymousClass0Y8.A04(context2, i3));
    }

    private void setAlertIcon(Drawable drawable) {
        this.A03.setImageDrawable(drawable);
    }

    private void setAlertIconTint(int i) {
        C107335b8.A0E(this.A03, i);
    }

    private void setAlertMessageText(String str) {
        this.A04.setText(str);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A05;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    public void setAlertButtonClickListener(View.OnClickListener onClickListener) {
        this.A02.setOnClickListener(onClickListener);
    }

    public void setAlertButtonText(String str) {
        this.A02.setText(str);
    }

    public void setAlertButtonVisibility(int i) {
        this.A02.setVisibility(i);
    }

    public void setTopDividerVisibility(int i) {
        this.A01.setVisibility(i);
    }

    public AnonymousClass94N(Context context) {
        super(context);
        if (!this.A06) {
            this.A06 = true;
            generatedComponent();
        }
        C18280x3.A0D(this).inflate(R.layout.f8nameremoved, this, true);
        setOrientation(1);
        setPadding(0, 0, 0, getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
        this.A02 = (Button) findViewById(R.id.card_details_alert_button);
        this.A04 = AnonymousClass002.A09(this, R.id.card_details_alert_message);
        this.A03 = AnonymousClass0x9.A0F(this, R.id.card_details_alert_icon);
        this.A00 = findViewById(R.id.card_details_alert_icon_container);
        this.A01 = findViewById(R.id.card_details_alert_divider);
        setAlertType(1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0066, code lost:
        setAlertMessageText(r1.getString(r0));
        setAlertIcon(getResources().getDrawable(com.whatsapp.R.drawable.ic_fbpay_error));
        r1 = getContext();
        r0 = com.whatsapp.R.color.f5nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        setAlertMessageText(getContext().getString(com.whatsapp.R.string.f11nameremoved));
        setAlertIcon(getResources().getDrawable(com.whatsapp.R.drawable.ic_settings_secure));
        r1 = getContext();
        r0 = com.whatsapp.R.color.f5nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002a, code lost:
        setAlertIconTint(X.AnonymousClass0Y8.A04(r1, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0031, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setAlertType(java.lang.String r3) {
        /*
            r2 = this;
            int r0 = r3.hashCode()
            switch(r0) {
                case -1757659853: goto L_0x0052;
                case -591252731: goto L_0x0042;
                case 1124965819: goto L_0x0032;
                default: goto L_0x0007;
            }
        L_0x0007:
            android.content.Context r1 = r2.getContext()
            r0 = 2131894981(0x7f1222c5, float:1.9424782E38)
            java.lang.String r0 = r1.getString(r0)
            r2.setAlertMessageText(r0)
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131232704(0x7f0807c0, float:1.8081525E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r2.setAlertIcon(r0)
            android.content.Context r1 = r2.getContext()
            r0 = 2131102099(0x7f060993, float:1.7816626E38)
        L_0x002a:
            int r0 = X.AnonymousClass0Y8.A04(r1, r0)
            r2.setAlertIconTint(r0)
            return
        L_0x0032:
            java.lang.String r0 = "SUSPENDED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0007
            android.content.Context r1 = r2.getContext()
            r0 = 2131887475(0x7f120573, float:1.9409558E38)
            goto L_0x0066
        L_0x0042:
            java.lang.String r0 = "EXPIRED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0007
            android.content.Context r1 = r2.getContext()
            r0 = 2131891703(0x7f1215f7, float:1.9418134E38)
            goto L_0x0066
        L_0x0052:
            java.lang.String r0 = "VOIDED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0007
            r0 = 8
            r2.setAlertButtonVisibility(r0)
            android.content.Context r1 = r2.getContext()
            r0 = 2131887470(0x7f12056e, float:1.9409548E38)
        L_0x0066:
            java.lang.String r0 = r1.getString(r0)
            r2.setAlertMessageText(r0)
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131232220(0x7f0805dc, float:1.8080543E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r2.setAlertIcon(r0)
            android.content.Context r1 = r2.getContext()
            r0 = 2131102098(0x7f060992, float:1.7816624E38)
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass94N.setAlertType(java.lang.String):void");
    }
}
