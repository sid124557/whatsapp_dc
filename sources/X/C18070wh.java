package X;

import android.content.res.Configuration;
import android.graphics.Rect;
import androidx.car.app.CarAppBinder;
import androidx.car.app.utils.RemoteUtils$SurfaceCallbackStub;
import java.util.Objects;

/* renamed from: X.0wh  reason: invalid class name and case insensitive filesystem */
public class C18070wh implements C15650ri {
    public Object A00;
    public Object A01;
    public final int A02;

    public C18070wh(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final Object B1v() {
        switch (this.A02) {
            case 0:
                Objects.requireNonNull((Object) null);
                AnonymousClass0VH.A00();
                return null;
            case 1:
                CarAppBinder.$r8$lambda$f7LOk0K_bjVEYPVzGzm8YMRUA8o((CarAppBinder) this.A00, (Configuration) this.A01);
                throw AnonymousClass000.A0L();
            case 2:
                RemoteUtils$SurfaceCallbackStub.m5$r8$lambda$Us3aqspNPssoqTo05TqqsVHIzE((RemoteUtils$SurfaceCallbackStub) this.A00, (Rect) this.A01);
                throw AnonymousClass000.A0L();
            case 3:
                RemoteUtils$SurfaceCallbackStub.$r8$lambda$OZtEIqNp19Tbq1qCTePWz81Lfjw((RemoteUtils$SurfaceCallbackStub) this.A00, (C06790Zf) this.A01);
                throw AnonymousClass000.A0L();
            case 4:
                RemoteUtils$SurfaceCallbackStub.$r8$lambda$agkemRv7pRP3C6NQN9BVj2kcidA((RemoteUtils$SurfaceCallbackStub) this.A00, (Rect) this.A01);
                throw AnonymousClass000.A0L();
            default:
                RemoteUtils$SurfaceCallbackStub.$r8$lambda$RGBhsjx_1J8NWgBb4N8Ae6NrbZk((RemoteUtils$SurfaceCallbackStub) this.A00, (C06790Zf) this.A01);
                throw AnonymousClass000.A0L();
        }
    }
}
