package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.info.views.CustomNotificationsInfoView;
import com.whatsapp.jid.Jid;

/* renamed from: X.54H  reason: invalid class name */
public class AnonymousClass54H extends C109665ez {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public AnonymousClass54H(CustomNotificationsInfoView customNotificationsInfoView, C27991fJ r3) {
        this.A03 = 2;
        this.A02 = customNotificationsInfoView;
        this.A01 = r3;
        this.A00 = 16;
    }

    public void A07(View view) {
        switch (this.A03) {
            case 0:
                AnonymousClass7HD r4 = (AnonymousClass7HD) this.A01;
                C149337Mb r3 = r4.A01;
                r3.A01 = 2;
                r3.A02 = new AnonymousClass7HC((C166447yh) this.A02, this.A00);
                r4.A00.A0G(r3);
                return;
            case 1:
                ((Activity) this.A01).startActivityForResult((Intent) this.A02, this.A00);
                return;
            case 2:
                CustomNotificationsInfoView customNotificationsInfoView = (CustomNotificationsInfoView) this.A02;
                C89654ea r5 = customNotificationsInfoView.A01;
                Context context = customNotificationsInfoView.getContext();
                Intent A07 = C18320x8.A07();
                C86604Kt.A13(A07, (Jid) this.A01, context.getPackageName(), "com.whatsapp.settings.SettingsJidNotificationActivity");
                C05680Um.A02(r5, A07, (Bundle) null, 16);
                return;
            default:
                C125606Ir r0 = (C125606Ir) this.A01;
                r0.A06.Bci((AnonymousClass39M) this.A02, r0.A08, this.A00);
                return;
        }
    }

    public AnonymousClass54H(Object obj, Object obj2, int i, int i2) {
        this.A03 = i2;
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = i;
    }
}
