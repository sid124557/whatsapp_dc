package X;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.Window;

/* renamed from: X.07u  reason: invalid class name */
public class AnonymousClass07u extends AnonymousClass0O3 implements C15940sD, C17310vJ, C15550rY, C16550ta, C16560tb, C16570tc, C16580td, C16610tg, C17300vI, C15890s8 {
    public final Activity A00;
    public final Context A01;
    public final Handler A02;
    public final C08270df A03 = new AnonymousClass07w();
    public final /* synthetic */ C003203q A04;

    public AnonymousClass07u(C003203q r3) {
        this.A04 = r3;
        Handler handler = new Handler();
        this.A00 = r3;
        this.A01 = r3;
        this.A02 = handler;
    }

    public View A00(int i) {
        return this.A04.findViewById(i);
    }

    public boolean A01() {
        Window window = this.A04.getWindow();
        if (window == null || window.peekDecorView() == null) {
            return false;
        }
        return true;
    }

    public void AwY(C14960qY r2) {
        this.A04.AwY(r2);
    }

    public void Awa(C15790rw r2) {
        this.A04.Awa(r2);
    }

    public void Awc(C15790rw r2) {
        this.A04.Awc(r2);
    }

    public void Awd(C15790rw r2) {
        this.A04.Awd(r2);
    }

    public void Awg(C15790rw r2) {
        this.A04.Awg(r2);
    }

    public AnonymousClass0US B49() {
        return this.A04.A04;
    }

    public AnonymousClass0Ts BA8() {
        return this.A04.A05;
    }

    public AnonymousClass0UG BCR() {
        return this.A04.A07.A01;
    }

    public AnonymousClass0N2 BEL() {
        return this.A04.BEL();
    }

    public void BMj(C08310eF r2, C08270df r3) {
        this.A04.A5d(r2);
    }

    public void BjE(C14960qY r2) {
        this.A04.BjE(r2);
    }

    public void BjF(C15790rw r2) {
        this.A04.BjF(r2);
    }

    public void BjG(C15790rw r2) {
        this.A04.BjG(r2);
    }

    public void BjH(C15790rw r2) {
        this.A04.BjH(r2);
    }

    public void BjK(C15790rw r2) {
        this.A04.BjK(r2);
    }

    public AnonymousClass0O9 getLifecycle() {
        return this.A04.A03;
    }
}
