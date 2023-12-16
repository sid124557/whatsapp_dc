package X;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.whatsapp.R;

/* renamed from: X.5bY  reason: invalid class name and case insensitive filesystem */
public class C107585bY implements C181128mC {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C107585bY(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A00 = obj4;
        this.A01 = obj3;
        this.A02 = obj2;
        this.A03 = obj;
    }

    public final void BW2(C105415Uv r14) {
        AnonymousClass6TJ r0;
        AnonymousClass6TJ r02;
        AnonymousClass5PJ r7;
        C187138wZ r8;
        if (this.A04 != 0) {
            AnonymousClass4un r6 = (AnonymousClass4un) this.A00;
            AnonymousClass6TJ r2 = (AnonymousClass6TJ) this.A01;
            LatLng latLng = (LatLng) this.A02;
            View view = (View) this.A03;
            if (C107405bG.A0D(r6.getContext())) {
                r02 = AnonymousClass6TJ.A00(r6.getContext(), R.raw.night_map_style_json);
            } else {
                r02 = null;
            }
            if (r2 == null) {
                r2 = r02;
            }
            A00(r6, view, r14, latLng, r2);
            AnonymousClass5PJ r03 = r6.A00;
            if (r03 != null) {
                try {
                    C163177tO r22 = (C163177tO) r03.A00;
                    r22.A02(1, r22.A00());
                } catch (RemoteException e) {
                    throw AnonymousClass4L0.A0I(e);
                }
            }
            Integer num = r6.A01;
            if (num != null) {
                double intValue = (double) num.intValue();
                double d = latLng.A00;
                double d2 = latLng.A01;
                int width = view.getWidth() * 2;
                int height = view.getHeight() * 2;
                Context context = r6.getContext();
                if (width <= 0 || height <= 0) {
                    r7 = null;
                } else {
                    C127766Tf r12 = new C127766Tf();
                    r12.A05 = AnonymousClass4L0.A0H(d, d2);
                    r12.A01 = 6.0f;
                    r12.A04 = C18300x5.A03(context, R.attr.f3nameremoved, R.color.f5nameremoved);
                    r12.A03 = C18300x5.A03(context, R.attr.f3nameremoved, R.color.f5nameremoved);
                    r12.A00 = intValue;
                    try {
                        C163177tO r9 = (C163177tO) r14.A01;
                        Parcel A002 = r9.A00();
                        C161087oy.A01(A002, r12);
                        Parcel A012 = r9.A01(35, A002);
                        IBinder readStrongBinder = A012.readStrongBinder();
                        if (readStrongBinder == null) {
                            r8 = null;
                        } else {
                            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                            if (queryLocalInterface instanceof C187138wZ) {
                                r8 = (C187138wZ) queryLocalInterface;
                            } else {
                                r8 = new C128636Ww(readStrongBinder);
                            }
                        }
                        A012.recycle();
                        r7 = new AnonymousClass5PJ(r8);
                        int min = Math.min(width, height);
                        LatLng A0H = AnonymousClass4L0.A0H(d, d2);
                        AnonymousClass5Q9 r4 = new AnonymousClass5Q9();
                        double d3 = intValue / 6371009.0d;
                        r4.A01(C86624Kv.A0G(A0H, 0.0d, d3));
                        r4.A01(C86624Kv.A0G(A0H, 90.0d, d3));
                        r4.A01(C86624Kv.A0G(A0H, 180.0d, d3));
                        r4.A01(C86624Kv.A0G(A0H, 270.0d, d3));
                        LatLngBounds A003 = r4.A00();
                        C162177rO.A03(A003, "bounds must not be null");
                        try {
                            ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate = C106555Zl.A00;
                            C162177rO.A03(iCameraUpdateFactoryDelegate, "CameraUpdateFactory is not initialized");
                            C163177tO r23 = (C163177tO) iCameraUpdateFactoryDelegate;
                            Parcel A004 = r23.A00();
                            C161087oy.A01(A004, A003);
                            A004.writeInt(min);
                            A004.writeInt(min);
                            A004.writeInt(50);
                            r14.A0A(new AnonymousClass7BU(C86604Kt.A0M(A004, r23, 11)));
                        } catch (RemoteException e2) {
                            throw AnonymousClass4L0.A0I(e2);
                        }
                    } catch (RemoteException e3) {
                        throw AnonymousClass4L0.A0I(e3);
                    }
                }
                r6.A00 = r7;
                return;
            }
            return;
        }
        View view2 = (View) this.A00;
        AnonymousClass6TJ r42 = (AnonymousClass6TJ) this.A01;
        LatLng latLng2 = (LatLng) this.A02;
        View view3 = (View) this.A03;
        if (C107405bG.A0D(view2.getContext())) {
            r0 = AnonymousClass6TJ.A00(view2.getContext(), R.raw.night_map_style_json);
        } else {
            r0 = null;
        }
        if (r42 == null) {
            r42 = r0;
        }
        A00(view2, view3, r14, latLng2, r42);
    }

    public static void A00(View view, View view2, C105415Uv r4, LatLng latLng, AnonymousClass6TJ r6) {
        r4.A0J(r6);
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        r4.A08(0, dimensionPixelSize * 2, dimensionPixelSize, dimensionPixelSize);
        C151747Wd r1 = new C151747Wd();
        r1.A01(latLng);
        r1.A00 = 15.0f;
        r4.A0A(C106555Zl.A00(r1.A00()));
        C626936e.A04(view2);
        view2.setVisibility(0);
    }
}
