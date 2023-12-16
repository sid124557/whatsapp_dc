package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.7jc  reason: invalid class name and case insensitive filesystem */
public final class C158217jc {
    public Bundle A00;
    public C178458hZ A01;
    public C178468ha A02;
    public LinkedList A03;
    public final Context A04;
    public final ViewGroup A05;
    public final C178468ha A06;
    public final GoogleMapOptions A07;
    public final List A08;

    public final void A00(int i) {
        while (!this.A03.isEmpty() && ((C183918qs) this.A03.getLast()).Bsp() >= i) {
            this.A03.removeLast();
        }
    }

    public final void A01(Bundle bundle, C183918qs r6) {
        IMapViewDelegate iMapViewDelegate;
        C178458hZ r0 = this.A01;
        if (r0 != null) {
            r6.Bsu(r0);
            return;
        }
        LinkedList linkedList = this.A03;
        if (linkedList == null) {
            linkedList = AnonymousClass0x9.A18();
            this.A03 = linkedList;
        }
        linkedList.add(r6);
        if (bundle != null) {
            Bundle bundle2 = this.A00;
            if (bundle2 == null) {
                this.A00 = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        C178468ha r02 = this.A06;
        this.A02 = r02;
        if (r02 != null && this.A01 == null) {
            try {
                Context context = this.A04;
                C154947e0.A00(context);
                C187198wk A012 = C155377el.A01(context);
                AnonymousClass6UT r2 = new AnonymousClass6UT(context);
                GoogleMapOptions googleMapOptions = this.A07;
                C163177tO r3 = (C163177tO) A012;
                Parcel A002 = r3.A00();
                C161087oy.A00(r2, A002);
                C161087oy.A01(A002, googleMapOptions);
                Parcel A013 = r3.A01(3, A002);
                IBinder readStrongBinder = A013.readStrongBinder();
                if (readStrongBinder == null) {
                    iMapViewDelegate = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
                    if (queryLocalInterface instanceof IMapViewDelegate) {
                        iMapViewDelegate = (IMapViewDelegate) queryLocalInterface;
                    } else {
                        iMapViewDelegate = new AnonymousClass6X0(readStrongBinder);
                    }
                }
                A013.recycle();
                if (iMapViewDelegate != null) {
                    C178468ha r22 = this.A02;
                    C1695789v r03 = new C1695789v(this.A05, iMapViewDelegate);
                    C158217jc r32 = ((C1695889w) r22).A00;
                    r32.A01 = r03;
                    Iterator it = r32.A03.iterator();
                    while (it.hasNext()) {
                        ((C183918qs) it.next()).Bsu(r32.A01);
                    }
                    r32.A03.clear();
                    r32.A00 = null;
                    List<C181128mC> list = this.A08;
                    for (C181128mC A003 : list) {
                        ((C1695789v) this.A01).A00(A003);
                    }
                    list.clear();
                }
            } catch (RemoteException e) {
                throw new AnonymousClass8RJ(e);
            } catch (C143476yw unused) {
            }
        }
    }

    public C158217jc(Context context, ViewGroup viewGroup, GoogleMapOptions googleMapOptions) {
        this();
        this.A08 = AnonymousClass001.A0s();
        this.A05 = viewGroup;
        this.A04 = context;
        this.A07 = googleMapOptions;
    }

    public C158217jc() {
        this.A06 = new C1695889w(this);
    }
}
