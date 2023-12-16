package X;

import android.content.Intent;
import android.content.res.Configuration;
import androidx.car.app.CarAppBinder;
import androidx.car.app.ICarHost;

/* renamed from: X.0cj  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C07730cj implements C15650ri {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ Configuration A01;
    public final /* synthetic */ CarAppBinder A02;
    public final /* synthetic */ ICarHost A03;

    public final Object B1v() {
        CarAppBinder.m1$r8$lambda$pQEqo1Se2nevCEjHrvw2DXCY24(this.A02, this.A03, this.A01, this.A00);
        throw AnonymousClass000.A0L();
    }

    public /* synthetic */ C07730cj(Intent intent, Configuration configuration, CarAppBinder carAppBinder, ICarHost iCarHost) {
        this.A02 = carAppBinder;
        this.A03 = iCarHost;
        this.A01 = configuration;
        this.A00 = intent;
    }
}
