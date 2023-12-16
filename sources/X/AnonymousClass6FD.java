package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.maps.GoogleMapOptions;
import com.whatsapp.R;

/* renamed from: X.6FD  reason: invalid class name */
public class AnonymousClass6FD extends FrameLayout {
    public final C158217jc A00;

    public void A02() {
        C158217jc r1 = this.A00;
        C178458hZ r0 = r1.A01;
        if (r0 != null) {
            try {
                C163177tO r2 = (C163177tO) ((C1695789v) r0).A02;
                r2.A02(5, r2.A00());
            } catch (RemoteException e) {
                throw new AnonymousClass8RJ(e);
            }
        } else {
            r1.A00(1);
        }
    }

    public void A03() {
        C178458hZ r0 = this.A00.A01;
        if (r0 != null) {
            try {
                C163177tO r2 = (C163177tO) ((C1695789v) r0).A02;
                r2.A02(6, r2.A00());
            } catch (RemoteException e) {
                throw new AnonymousClass8RJ(e);
            }
        }
    }

    public void A04() {
        C158217jc r1 = this.A00;
        C178458hZ r0 = r1.A01;
        if (r0 != null) {
            try {
                C163177tO r2 = (C163177tO) ((C1695789v) r0).A02;
                r2.A02(4, r2.A00());
            } catch (RemoteException e) {
                throw new AnonymousClass8RJ(e);
            }
        } else {
            r1.A00(5);
        }
    }

    public void A05() {
        C158217jc r2 = this.A00;
        r2.A01((Bundle) null, new C1695989x(r2));
    }

    public void A07(Bundle bundle) {
        C158217jc r1 = this.A00;
        C178458hZ r0 = r1.A01;
        if (r0 != null) {
            C1695789v r02 = (C1695789v) r0;
            try {
                Bundle A08 = AnonymousClass002.A08();
                C160897ob.A01(bundle, A08);
                C163177tO r2 = (C163177tO) r02.A02;
                Parcel A002 = r2.A00();
                C161087oy.A01(A002, A08);
                Parcel A01 = r2.A01(7, A002);
                if (A01.readInt() != 0) {
                    A08.readFromParcel(A01);
                }
                A01.recycle();
                C160897ob.A01(A08, bundle);
            } catch (RemoteException e) {
                throw new AnonymousClass8RJ(e);
            }
        } else {
            Bundle bundle2 = r1.A00;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
        }
    }

    public void A08(C181128mC r4) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            C162177rO.A03(r4, "callback must not be null.");
            C158217jc r1 = this.A00;
            C178458hZ r0 = r1.A01;
            if (r0 != null) {
                ((C1695789v) r0).A00(r4);
            } else {
                r1.A08.add(r4);
            }
        } else {
            throw AnonymousClass001.A0e("getMapAsync() must be called on the main thread");
        }
    }

    public AnonymousClass6FD(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.A00 = new C158217jc(context, this, googleMapOptions);
        setClickable(true);
    }

    public void A06(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            C158217jc r1 = this.A00;
            r1.A01(bundle, new C1696089y(bundle, r1));
            if (r1.A01 == null) {
                AnonymousClass6Q8 r3 = AnonymousClass6Q8.A00;
                Context context = getContext();
                int A04 = r3.A04(context, 12451000);
                String A01 = C161967qu.A01(context, A04);
                Resources resources = context.getResources();
                int i = R.string.f11nameremoved;
                if (A04 != 1) {
                    i = R.string.f11nameremoved;
                    if (A04 != 2) {
                        i = R.string.f11nameremoved;
                        if (A04 != 3) {
                            i = 17039370;
                        }
                    }
                }
                String string = resources.getString(i);
                LinearLayout linearLayout = new LinearLayout(getContext());
                linearLayout.setOrientation(1);
                linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                addView(linearLayout);
                TextView textView = new TextView(getContext());
                textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                textView.setText(A01);
                linearLayout.addView(textView);
                Intent A05 = r3.A05(context, (String) null, A04);
                if (A05 != null) {
                    Button button = new Button(context);
                    button.setId(16908313);
                    button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                    button.setText(string);
                    linearLayout.addView(button);
                    button.setOnClickListener(new C109705f3(context, A05, 0));
                }
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
