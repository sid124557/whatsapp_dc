package X;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.notification.PopupNotification;
import com.whatsapp.status.playback.MessageReplyActivity;

/* renamed from: X.6Bb  reason: invalid class name and case insensitive filesystem */
public class C124126Bb implements C185908uR {
    public Object A00;
    public final int A01;

    public C124126Bb(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BZ9() {
        if (this.A01 == 0) {
            C113245l7 r1 = (C113245l7) this.A00;
            r1.A1S(0);
            r1.A15();
            r1.A51.A04();
        }
    }

    public boolean BZA(View view, MotionEvent motionEvent) {
        if (this.A01 != 0) {
            return false;
        }
        C113245l7 r1 = (C113245l7) this.A00;
        r1.A1S(0);
        return r1.A51.A0F(motionEvent);
    }

    public void BbF(View view) {
        switch (this.A01) {
            case 0:
                ((C113245l7) this.A00).A2J(false);
                return;
            case 1:
                ((PopupNotification) this.A00).A6o();
                return;
            default:
                ((MessageReplyActivity) this.A00).A7E(false);
                return;
        }
    }

    public boolean Bfd(View view, int i, KeyEvent keyEvent) {
        if (this.A01 != 0) {
            return false;
        }
        C113245l7 r1 = (C113245l7) this.A00;
        if (!r1.A6U || i != 23 || keyEvent.getAction() != 0 || r1.A2Q()) {
            return false;
        }
        C94294qu r0 = r1.A46;
        if (r0 != null && r0.A02()) {
            return false;
        }
        r1.A18();
        r1.A0w();
        if (r1.A2Q()) {
            return false;
        }
        AnonymousClass5ZT r02 = r1.A5q;
        C626936e.A06(r02);
        r02.A0V();
        return true;
    }

    public void Bfe() {
        AnonymousClass5ZT r2;
        switch (this.A01) {
            case 0:
                C113245l7 r0 = (C113245l7) this.A00;
                r0.A0w();
                r2 = r0.A5q;
                C626936e.A06(r2);
                break;
            case 1:
                PopupNotification popupNotification = (PopupNotification) this.A00;
                if (!popupNotification.A0t.A02()) {
                    r2 = popupNotification.A1M;
                    break;
                } else {
                    return;
                }
            default:
                MessageReplyActivity messageReplyActivity = (MessageReplyActivity) this.A00;
                if (messageReplyActivity.A0l.A02() || (r2 = messageReplyActivity.A1N) == null) {
                    return;
                }
        }
        if (TextUtils.isEmpty(C86614Ku.A0u(r2.A0Z).trim()) && r2.A1F.A00() && r2.A0V()) {
            r2.A16.A00(3);
            r2.A12.A02();
        }
    }

    public boolean Bff(View view, MotionEvent motionEvent) {
        boolean z;
        AnonymousClass5ZT r0;
        switch (this.A01) {
            case 0:
                C113245l7 r2 = (C113245l7) this.A00;
                C94294qu r02 = r2.A46;
                if (r02 != null && r02.A02()) {
                    return false;
                }
                r2.A18();
                r2.A0w();
                AnonymousClass5ZT r1 = r2.A5q;
                C626936e.A06(r1);
                return r1.A0W(motionEvent, view, r2.A6P);
            case 1:
                PopupNotification popupNotification = (PopupNotification) this.A00;
                z = false;
                if (!popupNotification.A0t.A02()) {
                    r0 = popupNotification.A1M;
                    break;
                } else {
                    return false;
                }
            default:
                MessageReplyActivity messageReplyActivity = (MessageReplyActivity) this.A00;
                z = false;
                if (messageReplyActivity.A0l.A02() || (r0 = messageReplyActivity.A1N) == null) {
                    return false;
                }
        }
        r0.A0W(motionEvent, view, z);
        return false;
    }
}
