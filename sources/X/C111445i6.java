package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.location.ContactLiveLocationThumbnail;
import com.whatsapp.location.DragBottomSheetIndicator;
import com.whatsapp.location.GroupChatLiveLocationsUi$13;
import com.whatsapp.location.LocationSharingService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.5i6  reason: invalid class name and case insensitive filesystem */
public abstract class C111445i6 implements AnonymousClass4F2, LocationListener {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04 = 0.0f;
    public float A05;
    public float A06 = 0.0f;
    public float A07;
    public float A08;
    public int A09;
    public int A0A;
    public int A0B;
    public long A0C = C625635p.A0L;
    public long A0D;
    public Activity A0E;
    public BroadcastReceiver A0F = new AnonymousClass67N(this, 5);
    public Bitmap A0G;
    public Bitmap A0H;
    public Drawable A0I;
    public Location A0J;
    public View A0K;
    public View A0L;
    public View A0M;
    public View A0N;
    public View A0O;
    public View A0P;
    public View A0Q;
    public View A0R;
    public View A0S;
    public View A0T;
    public View A0U;
    public TextView A0V;
    public RecyclerView A0W;
    public RecyclerView A0X;
    public BottomSheetBehavior A0Y;
    public BottomSheetBehavior A0Z;
    public TextEmojiLabel A0a;
    public C105365Uq A0b;
    public C95814uZ A0c;
    public UserJid A0d;
    public ContactLiveLocationThumbnail A0e;
    public ContactLiveLocationThumbnail A0f;
    public DragBottomSheetIndicator A0g;
    public C87904Wo A0h;
    public C87904Wo A0i;
    public C148197Hj A0j;
    public C149547Mw A0k;
    public C105735We A0l;
    public C54942pX A0m;
    public C54942pX A0n;
    public C54942pX A0o;
    public boolean A0p = false;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s = false;
    public boolean A0t = false;
    public boolean A0u = false;
    public final Handler A0v = AnonymousClass000.A0A();
    public final C111095hX A0w;
    public final C159027ky A0x;
    public final C69263Wi A0y;
    public final C56972sr A0z;
    public final C29411im A10;
    public final C54232oO A11 = new C189058zv(this, 4);
    public final C29301ib A12;
    public final AnonymousClass5UX A13;
    public final C64773Ex A14;
    public final C56602sG A15 = new C189088zy(this, 5);
    public final C29421in A16;
    public final AnonymousClass5ZU A17;
    public final C114015mM A18;
    public final C613330g A19;
    public final C56612sH A1A;
    public final AnonymousClass5ZR A1B;
    public final C620733j A1C;
    public final AnonymousClass4FW A1D = new C124166Bf(this, 14);
    public final C29431io A1E;
    public final C55702qm A1F = new AnonymousClass901(this, 7);
    public final C29241iV A1G;
    public final AnonymousClass4D8 A1H = new C159637mD(this, 0);
    public final AnonymousClass4EU A1I = new AnonymousClass6BR(this, 3);
    public final C621233o A1J;
    public final C28071fd A1K;
    public final C61222zu A1L;
    public final Runnable A1M = new C71533cG(this, 11);
    public final Runnable A1N = new C71533cG(this, 10);
    public final Runnable A1O = new C71533cG(this, 9);
    public final List A1P = AnonymousClass001.A0s();
    public final List A1Q = AnonymousClass001.A0s();
    public final List A1R = AnonymousClass001.A0s();
    public final Map A1S = AnonymousClass001.A0t();
    public final Set A1T = AnonymousClass0x9.A17();
    public volatile boolean A1U;

    public Dialog A05(int i) {
        if (i == 0) {
            C19340zH A002 = AnonymousClass5V0.A00(this.A0E);
            A002.A0T(R.string.f11nameremoved);
            A002.A0i(true);
            A002.A0W((DialogInterface.OnClickListener) null, R.string.f11nameremoved);
            C86614Ku.A1O(A002, this, 37, R.string.f11nameremoved);
            AnonymousClass043 create = A002.create();
            create.A01().A0J(1);
            return create;
        } else if (i != 2) {
            return null;
        } else {
            C1891190b r2 = new C1891190b(this, 38);
            C19340zH A003 = AnonymousClass5V0.A00(this.A0E);
            C86624Kv.A1F(A003);
            A003.A0i(true);
            A003.A0Y(r2, R.string.f11nameremoved);
            return A003.create();
        }
    }

    public abstract C105905Ww A0A();

    public void A0C() {
        this.A0o = null;
        this.A0j = null;
        A0Q((C105735We) null);
        A0H();
        this.A0h.A05();
    }

    public void A0F() {
        C159027ky r6 = this.A0x;
        this.A0q = r6.A07();
        this.A0r = this.A1B.A05();
        Context applicationContext = this.A0E.getApplicationContext();
        C621233o r5 = this.A1J;
        LocationSharingService.A04(applicationContext, r5);
        if (this.A0m == null) {
            r5.A0V(this.A1H);
            C86644Kx.A1V(this.A1I, r5.A0W);
            AnonymousClass904 r4 = new AnonymousClass904(this.A0c, this);
            Handler handler = this.A0v;
            Runnable runnable = this.A1M;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, this.A0C);
            this.A1L.A02(r4);
        }
        A0I();
        this.A0E.invalidateOptionsMenu();
        C154317cy.A01(this.A0F, this.A0E, new IntentFilter("android.location.PROVIDERS_CHANGED"), true);
        if (r5.A0d(this.A0c)) {
            r6.A05(this, "group-chat-live-location-ui-onresume", 0.0f, 3, 5000, 1000);
        }
        this.A10.A06(this);
    }

    public abstract void A0K();

    public abstract void A0L();

    public abstract void A0N(float f, boolean z);

    public abstract void A0R(C105735We r1);

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008d, code lost:
        r2 = r4.A05.A0S.A04(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0109, code lost:
        r2 = r3.A06.A00().A00(r4);
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0U(X.C54942pX r9) {
        /*
            r8 = this;
            r0 = 0
            r8.A0o = r0
            r8.A0H()
            if (r9 == 0) goto L_0x0033
            java.util.List r0 = r8.A1Q
            java.util.Iterator r2 = r0.iterator()
        L_0x000e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0033
            java.lang.Object r1 = r2.next()
            X.5We r1 = (X.C105735We) r1
            X.2pX r0 = r1.A02
            if (r0 != r9) goto L_0x000e
        L_0x001e:
            r8.A0Q(r1)
            r8.A0o = r9
            r5 = r8
            X.689 r5 = (X.AnonymousClass689) r5
            int r0 = r5.A01
            if (r0 == 0) goto L_0x004a
            java.lang.Object r3 = r5.A00
            com.whatsapp.location.GroupChatLiveLocationsActivity2 r3 = (com.whatsapp.location.GroupChatLiveLocationsActivity2) r3
            X.5Uv r0 = r3.A06
            if (r0 == 0) goto L_0x0140
            goto L_0x0035
        L_0x0033:
            r1 = 0
            goto L_0x001e
        L_0x0035:
            com.google.android.gms.maps.internal.IGoogleMapDelegate r2 = r0.A01     // Catch:{ RemoteException -> 0x0044 }
            X.7tO r2 = (X.C163177tO) r2     // Catch:{ RemoteException -> 0x0044 }
            r1 = 8
            android.os.Parcel r0 = r2.A00()     // Catch:{ RemoteException -> 0x0044 }
            r2.A02(r1, r0)     // Catch:{ RemoteException -> 0x0044 }
            goto L_0x00cb
        L_0x0044:
            r0 = move-exception
            X.8RJ r0 = X.AnonymousClass4L0.A0I(r0)
            throw r0
        L_0x004a:
            java.lang.Object r4 = r5.A00
            com.whatsapp.location.GroupChatLiveLocationsActivity r4 = (com.whatsapp.location.GroupChatLiveLocationsActivity) r4
            X.5hC r0 = r4.A05
            X.C626936e.A06(r0)
            X.5hC r0 = r4.A05
            r0.A07()
            r7 = 1
            r5.A0u = r7
            android.view.View r2 = r5.A0U
            X.5i6 r0 = r4.A0N
            X.2pX r1 = r0.A0m
            r0 = 8
            if (r1 != 0) goto L_0x0066
            r0 = 0
        L_0x0066:
            r2.setVisibility(r0)
            X.4ug r1 = r4.A0M
            r0 = 2
            r1.setLocationMode(r0)
            double r2 = r9.A00
            double r0 = r9.A01
            X.5ds r5 = X.C108975ds.A00(r2, r0)
            float r1 = r9.A02
            r0 = 1098907648(0x41800000, float:16.0)
            float r6 = r4.A74(r1, r0)
            r4.A0W = r7
            X.5hC r0 = r4.A05
            X.7yk r0 = r0.A02()
            float r0 = r0.A02
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c1
            X.5hC r0 = r4.A05
            X.5a3 r0 = r0.A0S
            android.graphics.Point r2 = r0.A04(r5)
            int r1 = r2.x
            if (r1 <= 0) goto L_0x00c1
            int r0 = r2.y
            if (r0 <= 0) goto L_0x00c1
            X.4ug r0 = r4.A0M
            int r0 = r0.getWidth()
            if (r1 >= r0) goto L_0x00c1
            int r1 = r2.y
            X.4ug r0 = r4.A0M
            int r0 = r0.getHeight()
            if (r1 >= r0) goto L_0x00c1
            X.5hC r3 = r4.A05
            X.7UM r2 = X.C153847c7.A01(r5, r6)
        L_0x00b5:
            X.8qT r1 = r4.A04
            r0 = 1500(0x5dc, float:2.102E-42)
            r3.A0B(r2, r1, r0)
            r4.A76()
            goto L_0x0140
        L_0x00c1:
            X.5hC r3 = r4.A05
            X.7UM r2 = new X.7UM
            r2.<init>()
            r2.A06 = r5
            goto L_0x00b5
        L_0x00cb:
            r4 = 1
            r5.A0u = r4
            android.view.View r2 = r5.A0U
            X.5i6 r0 = r3.A0O
            X.2pX r1 = r0.A0m
            r0 = 8
            if (r1 != 0) goto L_0x00d9
            r0 = 0
        L_0x00d9:
            r2.setVisibility(r0)
            X.4uh r1 = r3.A0N
            r0 = 2
            r1.setLocationMode(r0)
            boolean r0 = r3.A0X
            if (r0 != 0) goto L_0x013d
            r3.A0X = r4
            double r4 = r9.A00
            double r0 = r9.A01
            com.google.android.gms.maps.model.LatLng r4 = X.AnonymousClass4L0.A0H(r4, r0)
            float r1 = r9.A02
            r0 = 1098907648(0x41800000, float:16.0)
            float r5 = r3.A74(r1, r0)
            X.5Uv r0 = r3.A06
            r0.A05()
            X.5Uv r0 = r3.A06
            com.google.android.gms.maps.model.CameraPosition r0 = r0.A02()
            float r0 = r0.A02
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0149
            X.5Uv r0 = r3.A06
            X.5RL r0 = r0.A00()
            android.graphics.Point r2 = r0.A00(r4)
            int r1 = r2.x
            if (r1 <= 0) goto L_0x0149
            int r0 = r2.y
            if (r0 <= 0) goto L_0x0149
            X.4uh r0 = r3.A0N
            int r0 = r0.getWidth()
            if (r1 >= r0) goto L_0x0149
            int r1 = r2.y
            X.4uh r0 = r3.A0N
            int r0 = r0.getHeight()
            if (r1 >= r0) goto L_0x0149
            X.5Uv r0 = r3.A06
            r0.A05()
            X.5Uv r2 = r3.A06
            X.7BU r1 = X.C106555Zl.A02(r4, r5)
        L_0x0138:
            X.8qx r0 = r3.A05
            r2.A0B(r1, r0)
        L_0x013d:
            r3.A76()
        L_0x0140:
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r8.A0Y
            if (r1 == 0) goto L_0x0148
            r0 = 4
            r1.A0S(r0)
        L_0x0148:
            return
        L_0x0149:
            X.5Uv r2 = r3.A06
            X.7BU r1 = X.C106555Zl.A01(r4)
            goto L_0x0138
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111445i6.A0U(X.2pX):void");
    }

    public static /* synthetic */ void A03(C111445i6 r1, float f, boolean z) {
        r1.A06 = f;
        r1.A0N(Math.max(r1.A04, f), z);
    }

    public static boolean A04(LatLngBounds latLngBounds) {
        LatLng latLng = latLngBounds.A01;
        double d = latLng.A00;
        LatLng latLng2 = latLngBounds.A00;
        if (d - latLng2.A00 > 80.0d) {
            return false;
        }
        double d2 = latLng2.A01 - latLng.A01;
        if (d2 < 0.0d) {
            d2 += 360.0d;
        }
        if (d2 <= 90.0d) {
            return true;
        }
        return false;
    }

    public LatLng A07() {
        double latitude;
        double longitude;
        if (this.A0d != null) {
            Iterator it = this.A1P.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C54942pX r5 = (C54942pX) it.next();
                if (r5 != null && r5.A05 > 0 && r5.A06.equals(this.A0d)) {
                    latitude = r5.A00;
                    longitude = r5.A01;
                    break;
                }
            }
        }
        Location A012 = this.A0x.A01("group-chat-live-location-ui");
        if (A012 == null) {
            return null;
        }
        latitude = A012.getLatitude();
        longitude = A012.getLongitude();
        return AnonymousClass4L0.A0H(latitude, longitude);
    }

    public C105735We A09(C54942pX r6) {
        if (r6 == null) {
            return null;
        }
        for (C105735We r3 : this.A1Q) {
            List list = r3.A04;
            if (list.size() > 1 && list.contains(r6)) {
                return r3;
            }
        }
        return null;
    }

    public String A0B(C105735We r10) {
        List<C54942pX> list = r10.A04;
        if (list.size() == 1 && this.A0z.A0a(((C54942pX) list.get(0)).A06)) {
            return this.A0E.getString(R.string.f11nameremoved);
        }
        ArrayList A0s2 = AnonymousClass001.A0s();
        for (C54942pX r0 : list) {
            A0s2.add(r0.A06);
        }
        C620733j r6 = this.A1C;
        long size = (long) A0s2.size();
        Object[] objArr = new Object[1];
        C620733j.A03(r6, this.A17.A0V(A0s2, 3), objArr, 0);
        return r6.A0L(objArr, R.plurals.f9nameremoved, size);
    }

    public void A0D() {
        this.A0b.A00();
        this.A16.A07(this.A15);
        this.A1E.A07(this.A1D);
        this.A12.A07(this.A11);
        this.A1G.A07(this.A1F);
    }

    public void A0E() {
        this.A10.A07(this);
        this.A0D = 0;
        Handler handler = this.A0v;
        handler.removeCallbacks(this.A1M);
        C61222zu r6 = this.A1L;
        C95814uZ r9 = this.A0c;
        C71763cd r5 = new C71763cd(r9);
        AnonymousClass31C r10 = r6.A02;
        String A032 = r10.A03();
        C18260x0.A0s("LocationSubscriptionSendMethods/unsubscribe; iqId=", A032, AnonymousClass001.A0o());
        AnonymousClass36K r7 = new AnonymousClass36K("unsubscribe", (AnonymousClass39V[]) null);
        ArrayList A0I2 = AnonymousClass002.A0I(5);
        AnonymousClass39V.A03(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032, A0I2);
        AnonymousClass39V.A03("xmlns", "location", A0I2);
        AnonymousClass39V.A03(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", A0I2);
        String str = "to";
        if (r6.A01.A0X(4177)) {
            A0I2.add(new AnonymousClass39V((Jid) C135206kI.A00, str));
            str = "target";
        }
        A0I2.add(new AnonymousClass39V((Jid) r9, str));
        r10.A0D(new AnonymousClass4KX(r5, r6, r5, 9), AnonymousClass36K.A0G(r7, (AnonymousClass39V[]) A0I2.toArray(C61222zu.A05)), A032, 83, 32000);
        handler.removeCallbacks(this.A1O);
        handler.removeCallbacks(this.A1N);
        this.A0x.A04(this);
        this.A0J = null;
        this.A0E.unregisterReceiver(this.A0F);
        C621233o r2 = this.A1J;
        r2.A0W.remove(this.A1I);
        r2.A0V.remove(this.A1H);
    }

    public final void A0G() {
        C620733j r8 = this.A1C;
        List list = this.A1R;
        long size = (long) list.size();
        Object[] objArr = new Object[1];
        boolean A1Y = C18300x5.A1Y(objArr, list.size());
        this.A0V.setText(r8.A0L(objArr, R.plurals.f9nameremoved, size));
        this.A0i.A05();
        if (this.A0R != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            C86664Kz.A0f(this.A0E).getMetrics(displayMetrics);
            int min = Math.min((int) (Math.min(4.5d, (double) list.size()) * ((double) this.A07)), displayMetrics.heightPixels / 2);
            this.A0Y.A0d(true);
            this.A0Y.A0S(5);
            int i = this.A0Z.A0O;
            RecyclerView recyclerView = this.A0X;
            if (i != 3) {
                C86654Ky.A14(recyclerView, -1, min);
                this.A0Z.A0S(3);
            } else if (min != recyclerView.getHeight()) {
                this.A0X.clearAnimation();
                AnonymousClass6F4 r2 = new AnonymousClass6F4(this.A0X, this, min);
                r2.setDuration((long) ((int) (((float) min) / C86604Kt.A00(this.A0E))));
                A0M((float) this.A0Y.A0L(), A1Y);
                this.A0X.startAnimation(r2);
            }
        } else if (this.A0M.getTranslationY() != 0.0f) {
            this.A0M.clearAnimation();
            View view = this.A0M;
            view.setTranslationY(C86664Kz.A02(view));
            C06560Yg.A05(this.A0M).A07(0.0f);
        }
    }

    public final void A0H() {
        this.A1R.clear();
        this.A0i.A05();
        A0Q((C105735We) null);
        if (this.A0R != null) {
            this.A0X.clearAnimation();
            BottomSheetBehavior bottomSheetBehavior = this.A0Y;
            if (bottomSheetBehavior.A0O != 4) {
                bottomSheetBehavior.A0S(4);
                A0Y(true);
            }
            BottomSheetBehavior bottomSheetBehavior2 = this.A0Z;
            if (bottomSheetBehavior2.A0O != 5) {
                bottomSheetBehavior2.A0S(5);
            } else {
                this.A06 = 0.0f;
                A0N(Math.max(this.A04, 0.0f), true);
            }
        } else {
            this.A0M.clearAnimation();
            C06560Yg.A05(this.A0M).A07(C86664Kz.A02(this.A0M));
        }
        A0L();
    }

    public final void A0I() {
        this.A0y.A0S(new C71533cG(this, 8));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0J() {
        /*
            r6 = this;
            long r3 = r6.A0D
            long r1 = java.lang.System.currentTimeMillis()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x006b
            com.whatsapp.TextEmojiLabel r1 = r6.A0a
            r0 = 0
            r1.setOnClickListener(r0)
            X.33o r1 = r6.A1J
            X.4uZ r0 = r6.A0c
            boolean r0 = r1.A0d(r0)
            if (r0 == 0) goto L_0x006c
            boolean r0 = r6.A0r
            if (r0 != 0) goto L_0x006c
            com.whatsapp.TextEmojiLabel r1 = r6.A0a
            r0 = 2131890513(0x7f121151, float:1.941572E38)
            r1.setText(r0)
            com.whatsapp.TextEmojiLabel r2 = r6.A0a
            r0 = 49
            X.53w r1 = new X.53w
            r1.<init>(r6, r0)
        L_0x002f:
            r2.setOnClickListener(r1)
        L_0x0032:
            android.view.View r0 = r6.A0T
            int r0 = r0.getVisibility()
            r3 = 0
            if (r0 == 0) goto L_0x004e
            android.view.View r0 = r6.A0T
            r0.setVisibility(r3)
            android.view.View r2 = r6.A0T
            android.app.Activity r1 = r6.A0E
            r0 = 2130771983(0x7f01000f, float:1.7147072E38)
            android.view.animation.Animation r0 = android.view.animation.AnimationUtils.loadAnimation(r1, r0)
            r2.startAnimation(r0)
        L_0x004e:
            java.util.List r0 = r6.A1P
            int r1 = r0.size()
            r0 = 2
            if (r1 <= r0) goto L_0x0058
            r3 = 1
        L_0x0058:
            com.whatsapp.location.DragBottomSheetIndicator r2 = r6.A0g
            if (r2 == 0) goto L_0x006b
            r1 = 8
            r0 = 8
            if (r3 == 0) goto L_0x0063
            r0 = 4
        L_0x0063:
            r2.setVisibility(r0)
            android.view.View r0 = r6.A0L
            r0.setVisibility(r1)
        L_0x006b:
            return
        L_0x006c:
            X.4uZ r0 = r6.A0c
            boolean r0 = r1.A0d(r0)
            if (r0 == 0) goto L_0x0089
            boolean r0 = r6.A0q
            if (r0 != 0) goto L_0x0089
            com.whatsapp.TextEmojiLabel r1 = r6.A0a
            r0 = 2131890513(0x7f121151, float:1.941572E38)
            r1.setText(r0)
            com.whatsapp.TextEmojiLabel r2 = r6.A0a
            r0 = 0
            X.53x r1 = new X.53x
            r1.<init>(r6, r0)
            goto L_0x002f
        L_0x0089:
            java.util.Set r1 = r6.A1T
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00e6
            monitor-enter(r1)
            java.util.ArrayList r0 = X.AnonymousClass002.A0J(r1)     // Catch:{ all -> 0x0136 }
            r1.clear()     // Catch:{ all -> 0x0136 }
            monitor-exit(r1)     // Catch:{ all -> 0x0136 }
            int r5 = r0.size()
            r3 = 0
            r4 = 1
            if (r5 != r4) goto L_0x00d7
            X.3Ex r1 = r6.A14
            java.lang.Object r0 = r0.get(r3)
            X.4uZ r0 = (X.C95814uZ) r0
            X.3ZH r1 = r1.A07(r0)
            if (r1 == 0) goto L_0x00d7
            X.5ZU r0 = r6.A17
            java.lang.String r3 = r0.A0M(r1)
            com.whatsapp.TextEmojiLabel r2 = r6.A0a
            android.app.Activity r1 = r6.A0E
            r0 = 2131890531(0x7f121163, float:1.9415756E38)
            java.lang.String r1 = X.AnonymousClass0x2.A0X(r1, r3, r4, r0)
            r0 = 0
            r2.A0K(r0, r1)
        L_0x00c5:
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 3000(0xbb8, double:1.482E-320)
            long r0 = r0 + r2
            r6.A0D = r0
            android.os.Handler r1 = r6.A0v
            java.lang.Runnable r0 = r6.A1O
            r1.postDelayed(r0, r2)
            goto L_0x0032
        L_0x00d7:
            com.whatsapp.TextEmojiLabel r2 = r6.A0a
            X.33j r1 = r6.A1C
            r0 = 2131755180(0x7f1000ac, float:1.9141232E38)
            java.lang.String r0 = X.C86604Kt.A0q(r1, r5, r3, r0)
            r2.setText(r0)
            goto L_0x00c5
        L_0x00e6:
            java.util.List r2 = r6.A1P
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x00f8
            com.whatsapp.TextEmojiLabel r1 = r6.A0a
            r0 = 2131890517(0x7f121155, float:1.9415728E38)
            r1.setText(r0)
            goto L_0x0032
        L_0x00f8:
            android.view.View r0 = r6.A0T
            int r0 = r0.getVisibility()
            r3 = 0
            if (r0 != 0) goto L_0x0118
            android.view.View r0 = r6.A0T
            r0.setVisibility(r3)
            android.app.Activity r1 = r6.A0E
            r0 = 2130771980(0x7f01000c, float:1.7147065E38)
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r1, r0)
            r0 = 6
            X.C86624Kv.A19(r1, r6, r0)
            android.view.View r0 = r6.A0T
            r0.startAnimation(r1)
        L_0x0118:
            int r1 = r2.size()
            r0 = 2
            boolean r2 = X.C86624Kv.A1W(r1, r0)
            com.whatsapp.location.DragBottomSheetIndicator r1 = r6.A0g
            if (r1 == 0) goto L_0x006b
            int r0 = X.C86614Ku.A09(r2)
            r1.setVisibility(r0)
            android.view.View r0 = r6.A0L
            if (r2 != 0) goto L_0x0132
            r3 = 8
        L_0x0132:
            r0.setVisibility(r3)
            return
        L_0x0136:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0136 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111445i6.A0J():void");
    }

    public final void A0M(float f, boolean z) {
        this.A04 = f;
        if (this.A0g.getVisibility() != 8) {
            this.A04 -= C86604Kt.A00(this.A0E) * 20.0f;
        }
        float f2 = this.A04;
        float max = Math.max(f2, this.A06);
        this.A0P.setTranslationY(-f2);
        A0N(max, z);
    }

    public void A0O(Activity activity, Bundle bundle) {
        this.A0E = activity;
        this.A05 = activity.getResources().getDimension(R.dimen.f6nameremoved);
        this.A07 = activity.getResources().getDimension(R.dimen.f6nameremoved);
        this.A00 = activity.getResources().getDimension(R.dimen.f6nameremoved);
        this.A08 = activity.getResources().getDimension(R.dimen.f6nameremoved);
        this.A03 = activity.getResources().getDimension(R.dimen.f6nameremoved);
        this.A01 = activity.getResources().getDimension(R.dimen.f6nameremoved);
        this.A02 = activity.getResources().getDimension(R.dimen.f6nameremoved);
        this.A0b = this.A18.A06(activity, "group-chat-live-locations-ui");
        String A0l2 = AnonymousClass0x7.A0l(activity);
        C106405Yw r3 = C95814uZ.A00;
        C95814uZ A052 = r3.A05(A0l2);
        C626936e.A06(A052);
        this.A0c = A052;
        String stringExtra = activity.getIntent().getStringExtra("target");
        AnonymousClass32Y r2 = UserJid.Companion;
        this.A0d = r2.A0E(stringExtra);
        UserJid A0E2 = r2.A0E(activity.getIntent().getStringExtra("final_location_jid"));
        long longExtra = activity.getIntent().getLongExtra("final_location_timestamp", 0);
        if (A0E2 != null && longExtra > 0) {
            C54942pX r6 = new C54942pX(A0E2);
            this.A0m = r6;
            r6.A05 = longExtra;
            r6.A00 = activity.getIntent().getDoubleExtra("final_location_latitude", 0.0d);
            this.A0m.A01 = activity.getIntent().getDoubleExtra("final_location_longitude", 0.0d);
        }
        this.A0q = this.A0x.A07();
        A0X("group-chat-live-location-ui-oncreate");
        this.A0W = (RecyclerView) activity.findViewById(R.id.user_list);
        this.A0N = activity.findViewById(R.id.list_holder);
        this.A0g = (DragBottomSheetIndicator) activity.findViewById(R.id.drag_indicator);
        this.A0P = activity.findViewById(R.id.map_bottom);
        this.A0O = activity.findViewById(R.id.list_holder_shadow);
        View view = this.A0N;
        int i = 8;
        if (view != null) {
            view.setVisibility(8);
            this.A0O.setVisibility(8);
            this.A0g.setVisibility(8);
            this.A0Y = new GroupChatLiveLocationsUi$13(this);
            C002002f A0W2 = AnonymousClass001.A0W(this.A0N);
            BottomSheetBehavior bottomSheetBehavior = this.A0Y;
            A0W2.A01(bottomSheetBehavior);
            bottomSheetBehavior.A0d(false);
            C1232167o.A00(this.A0Y, this, 8);
            this.A0L = activity.findViewById(R.id.drag_indicator_click);
            C989653x r1 = new C989653x(this, 1);
            this.A0g.setOnClickListener(r1);
            this.A0L.setOnClickListener(r1);
        }
        this.A0S = activity.findViewById(R.id.selected_list_title_holder);
        this.A0V = (TextView) activity.findViewById(R.id.selected_list_title);
        this.A0X = (RecyclerView) activity.findViewById(R.id.selected_list);
        C989653x.A00(activity.findViewById(R.id.selected_cancel), this, 2);
        this.A0R = activity.findViewById(R.id.selected_list_holder);
        View findViewById = activity.findViewById(R.id.landscape_selected_list_holder);
        this.A0M = findViewById;
        View view2 = this.A0R;
        if (view2 != null) {
            BottomSheetBehavior A012 = BottomSheetBehavior.A01(view2);
            this.A0Z = A012;
            C1232167o.A00(A012, this, 9);
            BottomSheetBehavior bottomSheetBehavior2 = this.A0Z;
            bottomSheetBehavior2.A0p = true;
            bottomSheetBehavior2.A0S(5);
        } else {
            findViewById.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass91Y(this, 2));
        }
        this.A0I = AnonymousClass0RP.A00(activity, R.drawable.live_location_list_divider);
        C1231567i r22 = new C1231567i(this, 1);
        List<C54942pX> list = this.A1P;
        this.A0h = new C87904Wo(this, list, false);
        C18320x8.A19(this.A0W, 1);
        this.A0W.setAdapter(this.A0h);
        RecyclerView recyclerView = this.A0W;
        recyclerView.A0h = true;
        recyclerView.A0o(r22);
        List list2 = this.A1R;
        this.A0i = new C87904Wo(this, list2, true);
        C18320x8.A19(this.A0X, 1);
        this.A0X.setAdapter(this.A0i);
        RecyclerView recyclerView2 = this.A0X;
        recyclerView2.A0h = true;
        recyclerView2.A0o(r22);
        this.A0a = (TextEmojiLabel) activity.findViewById(R.id.status);
        this.A0T = activity.findViewById(R.id.status_panel);
        A0Y(true);
        this.A1E.A06(this.A1D);
        this.A16.A06(this.A15);
        this.A12.A06(this.A11);
        this.A1G.A06(this.A1F);
        View inflate = View.inflate(this.A0E, R.layout.f8nameremoved, (ViewGroup) null);
        this.A0K = inflate;
        ContactLiveLocationThumbnail contactLiveLocationThumbnail = (ContactLiveLocationThumbnail) inflate.findViewById(R.id.contact_photo);
        this.A0e = contactLiveLocationThumbnail;
        AnonymousClass5UX r11 = this.A13;
        this.A0G = r11.A02(contactLiveLocationThumbnail.getContext(), 0.0f, R.drawable.avatar_contact, C86634Kw.A04(activity));
        this.A0H = r11.A02(this.A0e.getContext(), 0.0f, R.drawable.avatar_contact, activity.getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.A0K.measure(makeMeasureSpec, makeMeasureSpec);
        this.A0K.layout(0, 0, this.A0K.getMeasuredWidth(), this.A0K.getMeasuredHeight());
        View inflate2 = View.inflate(this.A0E, R.layout.f8nameremoved, (ViewGroup) null);
        this.A0Q = inflate2;
        this.A0f = (ContactLiveLocationThumbnail) inflate2.findViewById(R.id.contact_photo);
        this.A0Q.measure(makeMeasureSpec, makeMeasureSpec);
        this.A0B = this.A0Q.getMeasuredWidth();
        int measuredHeight = this.A0Q.getMeasuredHeight();
        this.A0A = measuredHeight;
        this.A0Q.layout(0, 0, this.A0B, measuredHeight);
        if (bundle != null) {
            this.A0s = bundle.getBoolean("map_follow_user", false);
            this.A0u = bundle.getBoolean("map_touched", false);
            C95814uZ A053 = r3.A05(bundle.getString("selected_user_jid"));
            if (A053 != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C54942pX r12 = (C54942pX) it.next();
                    if (r12.A06.equals(A053)) {
                        this.A0o = r12;
                        break;
                    }
                }
            }
            HashSet A0K2 = AnonymousClass002.A0K();
            C627336j.A0G(UserJid.class, bundle.getStringArrayList("selected_user_jids"), A0K2);
            if (!A0K2.isEmpty()) {
                for (C54942pX r13 : list) {
                    if (A0K2.contains(r13.A06)) {
                        list2.add(r13);
                    }
                }
                Collections.sort(list2, new C117775sT(this.A0z, this.A14, this.A17));
                this.A0i.A05();
                A0G();
            }
        }
        View findViewById2 = activity.findViewById(R.id.zoom_out);
        this.A0U = findViewById2;
        C989653x.A00(findViewById2, this, 3);
        View view3 = this.A0U;
        if (this.A0u && this.A0m == null) {
            i = 0;
        }
        view3.setVisibility(i);
        this.A0k = new C149547Mw(this.A1K, new C117775sT(this.A0z, this.A14, this.A17), (float) this.A0B, (float) this.A0A);
        LocationSharingService.A04(activity.getApplicationContext(), this.A1J);
    }

    public void A0P(Bundle bundle) {
        bundle.putBoolean("map_follow_user", this.A0s);
        bundle.putBoolean("map_touched", this.A0u);
        C54942pX r0 = this.A0o;
        if (r0 != null) {
            bundle.putString("selected_user_jid", r0.A06.getRawString());
        }
        List<C54942pX> list = this.A1R;
        if (!list.isEmpty()) {
            ArrayList A0p2 = AnonymousClass000.A0p(list);
            for (C54942pX r02 : list) {
                A0p2.add(r02.A06.getRawString());
            }
            bundle.putStringArrayList("selected_user_jids", A0p2);
        }
    }

    public void A0T(C105905Ww r12) {
        List<C54942pX> list;
        C105735We r1;
        C149547Mw r5 = this.A0k;
        C54942pX r0 = this.A0m;
        if (r0 != null) {
            list = Collections.singletonList(r0);
        } else {
            long A0H2 = this.A1A.A0H();
            ArrayList A0s2 = AnonymousClass001.A0s();
            for (C54942pX r4 : this.A1P) {
                if (r4 != null && (r4.A05 + 86400000 > A0H2 || this.A0z.A0a(r4.A06))) {
                    A0s2.add(r4);
                }
            }
            list = A0s2;
        }
        C54942pX r42 = this.A0o;
        List list2 = this.A1R;
        ArrayList A0s3 = AnonymousClass001.A0s();
        for (C54942pX r6 : list) {
            AnonymousClass0x2.A1G(r6, r12.A00(AnonymousClass4L0.A0H(r6.A00, r6.A01)), A0s3);
        }
        C86614Ku.A1U(A0s3, 40);
        ArrayList A0s4 = AnonymousClass001.A0s();
        Iterator it = A0s3.iterator();
        int i = Integer.MIN_VALUE;
        while (it.hasNext()) {
            AnonymousClass0PJ r3 = (AnonymousClass0PJ) it.next();
            if (r3.A00 != r42) {
                float f = ((float) i) + r5.A00;
                int i2 = ((Point) r3.A01).x;
                if (f < ((float) i2)) {
                    A0s4.add(C18300x5.A0s(r3));
                    i = i2;
                } else {
                    ((List) A0s4.get(C86664Kz.A0M(A0s4))).add(r3);
                }
            }
        }
        ArrayList A0s5 = AnonymousClass001.A0s();
        Iterator it2 = A0s4.iterator();
        while (it2.hasNext()) {
            List<AnonymousClass0PJ> list3 = (List) it2.next();
            C86614Ku.A1U(list3, 41);
            int i3 = Integer.MIN_VALUE;
            for (AnonymousClass0PJ r13 : list3) {
                Object obj = r13.A00;
                if (obj != r42) {
                    float f2 = ((float) i3) + r5.A01;
                    int i4 = ((Point) r13.A01).y;
                    if (f2 < ((float) i4)) {
                        A0s5.add(C18300x5.A0s(obj));
                        i3 = i4;
                    } else {
                        ((List) A0s5.get(C86664Kz.A0M(A0s5))).add(obj);
                    }
                }
            }
        }
        if (r42 != null) {
            A0s5.add(C18300x5.A0s(r42));
        }
        ArrayList A0s6 = AnonymousClass001.A0s();
        Iterator it3 = A0s5.iterator();
        while (it3.hasNext()) {
            List list4 = (List) it3.next();
            Collections.sort(list4, r5.A03);
            A0s6.add(new C105735We(r5.A02, list4, 0));
        }
        List<C105735We> list5 = this.A1Q;
        synchronized (list5) {
            list5.clear();
            list5.addAll(A0s6);
            int i5 = 0;
            int i6 = 1;
            if (this.A0m != null) {
                list5.clear();
                C54942pX r14 = this.A0m;
                if (this.A0o != null) {
                    i5 = 1;
                }
                list5.add(new C105735We(r14, i5));
            } else if (!list2.isEmpty()) {
                C105735We r32 = null;
                for (C105735We r2 : list5) {
                    List list6 = r2.A04;
                    ArrayList A0J2 = AnonymousClass002.A0J(list2);
                    A0J2.retainAll(list6);
                    if (A0J2.size() > i6) {
                        i6 = A0J2.size();
                        r32 = r2;
                    }
                }
                if (r32 != null) {
                    A0S(r32, false);
                } else {
                    A0C();
                }
            } else {
                C54942pX r33 = this.A0o;
                if (r33 != null) {
                    Iterator it4 = list5.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            r1 = null;
                            break;
                        }
                        r1 = (C105735We) it4.next();
                        if (r1.A02 == r33) {
                            break;
                        }
                    }
                    A0Q(r1);
                }
            }
        }
    }

    public final void A0V(C54942pX r5) {
        Map map = this.A1S;
        synchronized (map) {
            map.put(r5.A06, r5);
        }
        this.A0v.postDelayed(this.A1N, 3000);
    }

    public void A0W(Float f) {
        C148197Hj r5 = this.A0j;
        if (r5 == null) {
            return;
        }
        if (f == null || ((double) AnonymousClass002.A00(r5.A00, f.floatValue())) <= 0.05d) {
            String A012 = A01(r5.A01);
            this.A0j = null;
            for (C105735We r1 : this.A1Q) {
                if (A012.equals(A01(r1.A04))) {
                    A0S(r1, false);
                    return;
                }
            }
        }
    }

    public final void A0X(String str) {
        ArrayList A0s2;
        C54942pX r0;
        if (this.A0m != null) {
            List list = this.A1P;
            list.clear();
            list.add(this.A0m);
        } else {
            List list2 = this.A1P;
            list2.clear();
            C621233o r8 = this.A1J;
            C95814uZ r1 = this.A0c;
            synchronized (r8.A0Q) {
                Map map = (Map) r8.A0B().get(r1);
                long A0H2 = r8.A0D.A0H();
                A0s2 = AnonymousClass001.A0s();
                if (map != null) {
                    Iterator A0v2 = AnonymousClass001.A0v(map);
                    while (A0v2.hasNext()) {
                        AnonymousClass2OP r5 = (AnonymousClass2OP) A0v2.next();
                        if (C621233o.A02(r5.A00, A0H2) && (r0 = (C54942pX) r8.A0b.get(r5.A01)) != null) {
                            A0s2.add(r0);
                        }
                    }
                }
            }
            list2.addAll(A0s2);
            if (r8.A0d(this.A0c)) {
                if (this.A0n == null) {
                    UserJid userJid = (UserJid) C86634Kw.A0V(this.A0z).A0H;
                    C626936e.A06(userJid);
                    this.A0n = new C54942pX(userJid);
                    C159027ky r10 = this.A0x;
                    String str2 = str;
                    Location A012 = r10.A01(str2);
                    if (A012 != null) {
                        A02(A012, this, this.A0n);
                    }
                    r10.A05(this, str2, 0.0f, 3, 5000, 1000);
                }
                list2.add(0, this.A0n);
                return;
            }
        }
        this.A0n = null;
        this.A0J = null;
        this.A0x.A04(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0072, code lost:
        if (r14.A09 <= 2) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c9, code lost:
        if (r0 == 4) goto L_0x00a9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0Y(boolean r15) {
        /*
            r14 = this;
            java.util.List r8 = r14.A1P
            int r2 = r8.size()
            android.view.View r0 = r14.A0N
            if (r0 == 0) goto L_0x0010
            if (r15 != 0) goto L_0x0011
            int r0 = r14.A09
            if (r2 != r0) goto L_0x0011
        L_0x0010:
            return
        L_0x0011:
            r5 = 2
            float r6 = (float) r2
            if (r2 <= r5) goto L_0x0017
            r6 = 1069547520(0x3fc00000, float:1.5)
        L_0x0017:
            r13 = 1
            r4 = 0
            boolean r12 = X.C86624Kv.A1W(r2, r5)
            float r3 = r14.A03
            r9 = 0
            if (r12 == 0) goto L_0x00f0
            float r1 = r14.A00
        L_0x0024:
            float r1 = r1 + r3
            X.2pX r0 = r14.A0n
            if (r0 != 0) goto L_0x00ed
            X.2pX r0 = r14.A0m
            if (r0 != 0) goto L_0x00ed
            float r0 = r14.A08
            float r0 = r0 + r3
        L_0x0030:
            float r1 = r1 + r0
            int r1 = (int) r1
            float r0 = r14.A05
            float r6 = r6 * r0
            float r7 = (float) r1
            float r6 = r6 + r7
            int r6 = (int) r6
            r11 = 0
            if (r2 == 0) goto L_0x00e9
            r11 = 1
            if (r2 <= r5) goto L_0x00e9
            android.util.DisplayMetrics r1 = new android.util.DisplayMetrics
            r1.<init>()
            android.app.Activity r0 = r14.A0E
            android.view.Display r0 = X.C86664Kz.A0f(r0)
            r0.getMetrics(r1)
            int r3 = r1.heightPixels
            android.app.Activity r0 = r14.A0E
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131167297(0x7f070841, float:1.7948864E38)
            float r1 = r1.getDimension(r0)
            int r3 = r3 / r5
            float r0 = (float) r3
            float r3 = java.lang.Math.min(r1, r0)
            float r1 = r14.A05
            int r0 = r8.size()
            float r0 = (float) r0
            float r1 = r1 * r0
            float r1 = r1 + r7
            float r0 = java.lang.Math.min(r1, r3)
            int r3 = (int) r0
            r10 = 0
            int r0 = r14.A09
            if (r0 > r5) goto L_0x00eb
        L_0x0074:
            int r0 = r3 - r6
            float r7 = (float) r0
            android.view.View r0 = r14.A0T
            int r0 = r0.getVisibility()
            r5 = 4
            r8 = 8
            com.whatsapp.location.DragBottomSheetIndicator r1 = r14.A0g
            if (r0 != 0) goto L_0x00d8
            r0 = 8
            if (r12 == 0) goto L_0x0089
            r0 = 4
        L_0x0089:
            r1.setVisibility(r0)
            android.view.View r0 = r14.A0L
            r0.setVisibility(r8)
        L_0x0091:
            android.view.View r0 = r14.A0N
            if (r11 == 0) goto L_0x00cc
            r0.setVisibility(r4)
            android.view.View r0 = r14.A0O
            r0.setVisibility(r4)
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r14.A0Y
            r0.A0U(r6, r4)
            if (r13 == 0) goto L_0x00b8
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r14.A0Y
            r0.A0S(r5)
        L_0x00a9:
            float r0 = (float) r6
        L_0x00aa:
            r14.A0M(r0, r4)
        L_0x00ad:
            android.view.View r0 = r14.A0N
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass001.A0T(r0)
            r0.height = r3
        L_0x00b5:
            r14.A09 = r2
            return
        L_0x00b8:
            r1 = 3
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r14.A0Y
            if (r10 == 0) goto L_0x00c3
            r0.A0S(r1)
            float r0 = (float) r6
            float r0 = r0 + r7
            goto L_0x00aa
        L_0x00c3:
            int r0 = r0.A0O
            if (r0 != r1) goto L_0x00c9
            float r0 = (float) r3
            goto L_0x00aa
        L_0x00c9:
            if (r0 != r5) goto L_0x00ad
            goto L_0x00a9
        L_0x00cc:
            r0.setVisibility(r8)
            android.view.View r0 = r14.A0O
            r0.setVisibility(r8)
            r14.A0M(r9, r4)
            goto L_0x00b5
        L_0x00d8:
            int r0 = X.C86614Ku.A09(r12)
            r1.setVisibility(r0)
            android.view.View r1 = r14.A0L
            int r0 = X.C86614Ku.A09(r12)
            r1.setVisibility(r0)
            goto L_0x0091
        L_0x00e9:
            r3 = r6
            r10 = 1
        L_0x00eb:
            r13 = 0
            goto L_0x0074
        L_0x00ed:
            r0 = 0
            goto L_0x0030
        L_0x00f0:
            r1 = 0
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111445i6.A0Y(boolean):void");
    }

    public boolean A0Z(int i, int i2) {
        Activity activity = this.A0E;
        if (activity != null) {
            LocationSharingService.A04(activity.getApplicationContext(), this.A1J);
        }
        if (i == 34) {
            if (i2 != -1) {
                return false;
            }
            this.A1K.A06(this.A0E, this.A0c);
        } else if (i != 100) {
            return false;
        } else {
            if (i2 == 1000) {
                C111095hX r3 = this.A0w;
                Activity activity2 = this.A0E;
                r3.A0B(activity2, C86634Kw.A0D(activity2, C86664Kz.A1B(), this.A0c));
                this.A0E.finish();
                return true;
            }
        }
        return true;
    }

    public void BUB() {
        AnonymousClass904 r4 = new AnonymousClass904(this.A0c, this);
        Handler handler = this.A0v;
        Runnable runnable = this.A1M;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, this.A0C);
        this.A1L.A02(r4);
    }

    public /* synthetic */ void BUC() {
    }

    public /* synthetic */ void BUD() {
    }

    public /* synthetic */ void BUE() {
    }

    public /* synthetic */ void BUF() {
    }

    public void onLocationChanged(Location location) {
        if (C622534h.A01(location, this.A0J)) {
            this.A0J = location;
            C54942pX r0 = this.A0n;
            if (r0 != null) {
                A02(location, this, r0);
                this.A0h.A05();
                if (this.A0p) {
                    this.A0p = false;
                } else {
                    A0V(this.A0n);
                    return;
                }
            } else if (!this.A1J.A0d(this.A0c)) {
                return;
            }
            A0I();
        }
    }

    public static final String A01(List list) {
        ArrayList A0s2 = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0s2.add(((C54942pX) it.next()).A06.getRawString());
        }
        Collections.sort(A0s2);
        return TextUtils.join("|", A0s2);
    }

    public static void A02(Location location, C111445i6 r4, C54942pX r5) {
        r5.A00 = location.getLatitude();
        r4.A0n.A01 = location.getLongitude();
        r4.A0n.A05 = location.getTime();
        r4.A0n.A02 = location.getSpeed();
        r4.A0n.A03 = (int) location.getAccuracy();
        r4.A0n.A04 = (int) location.getBearing();
    }

    public Bitmap A06(C105735We r21) {
        ContactLiveLocationThumbnail contactLiveLocationThumbnail;
        View view;
        List list;
        boolean z;
        boolean z2;
        Bitmap A022;
        Activity activity;
        int i;
        ArrayList A0s2 = AnonymousClass001.A0s();
        C105735We r6 = r21;
        int i2 = r6.A00;
        float f = 1.0f;
        if (i2 == 1) {
            contactLiveLocationThumbnail = this.A0f;
            view = this.A0Q;
            list = r6.A04;
            if (list.size() == 1) {
                AnonymousClass3ZH A0A2 = this.A14.A0A(((C54942pX) list.get(0)).A06);
                C613330g r12 = this.A19;
                Activity activity2 = this.A0E;
                Bitmap A032 = r12.A03(activity2, A0A2, this.A0E.getResources().getDimension(R.dimen.f6nameremoved), activity2.getResources().getDimensionPixelSize(R.dimen.f6nameremoved), true);
                if (A032 == null) {
                    AnonymousClass5UX r10 = this.A13;
                    A032 = r10.A03(contactLiveLocationThumbnail.getContext(), r10.A00(A0A2));
                    z2 = true;
                } else {
                    z2 = false;
                }
                A0s2.add(A032);
            } else {
                for (int i3 = 0; i3 < Math.min(list.size(), 4); i3++) {
                    AnonymousClass3ZH A0A3 = this.A14.A0A(((C54942pX) list.get(i3)).A06);
                    C613330g r122 = this.A19;
                    Activity activity3 = this.A0E;
                    Bitmap A033 = r122.A03(activity3, A0A3, 0.0f, activity3.getResources().getDimensionPixelSize(R.dimen.f6nameremoved), true);
                    if (A033 == null) {
                        A033 = this.A0H;
                    }
                    A0s2.add(A033);
                }
                z2 = false;
            }
        } else {
            contactLiveLocationThumbnail = this.A0e;
            view = this.A0K;
            list = r6.A04;
            if (list.size() == 1) {
                AnonymousClass3ZH A0A4 = this.A14.A0A(((C54942pX) list.get(0)).A06);
                C613330g r13 = this.A19;
                Activity activity4 = this.A0E;
                int A042 = C86634Kw.A04(activity4);
                Bitmap A034 = r13.A03(activity4, A0A4, C18310x6.A01(this.A0E), A042, true);
                if (A034 == null) {
                    AnonymousClass5UX r132 = this.A13;
                    A034 = r132.A03(contactLiveLocationThumbnail.getContext(), r132.A00(A0A4));
                    z = true;
                } else {
                    z = false;
                }
                A0s2.add(A034);
            } else {
                for (int i4 = 0; i4 < Math.min(list.size(), 4); i4++) {
                    AnonymousClass3ZH A0A5 = this.A14.A0A(((C54942pX) list.get(i4)).A06);
                    C613330g r14 = this.A19;
                    Activity activity5 = this.A0E;
                    Bitmap A035 = r14.A03(activity5, A0A5, 0.0f, C86634Kw.A04(activity5), true);
                    if (A035 == null) {
                        A035 = this.A0G;
                    }
                    A0s2.add(A035);
                }
                z = false;
            }
            if (i2 == 2) {
                f = 0.3f;
            }
        }
        contactLiveLocationThumbnail.setAlpha(f);
        if (A0s2.size() == 1) {
            A022 = (Bitmap) A0s2.get(0);
        } else {
            A022 = C114015mM.A02(A0s2, 0.0f);
        }
        contactLiveLocationThumbnail.setImageBitmap(A022);
        int i5 = r6.A01;
        if (i5 == 0) {
            activity = this.A0E;
            i = AnonymousClass5Yj.A02(activity, R.attr.f3nameremoved, R.color.f5nameremoved);
            contactLiveLocationThumbnail.A01 = AnonymousClass0Y8.A04(activity, i);
        } else if (i5 != 1) {
            contactLiveLocationThumbnail.A01 = 0;
        } else {
            activity = this.A0E;
            i = R.color.f5nameremoved;
            contactLiveLocationThumbnail.A01 = AnonymousClass0Y8.A04(activity, i);
        }
        contactLiveLocationThumbnail.A03 = z2;
        contactLiveLocationThumbnail.A02 = list.size();
        Bitmap A0Y2 = C86664Kz.A0Y(view.getWidth(), view.getHeight());
        view.draw(AnonymousClass4L0.A06(A0Y2));
        return A0Y2;
    }

    public C105735We A08(LatLng latLng) {
        LatLng A042;
        LatLng A043;
        C105905Ww A0A2 = A0A();
        if (A0A2 != null) {
            Point A002 = A0A2.A00(latLng);
            Point point = new Point(A002.x - (this.A0B / 2), A002.y - (this.A0A / 2));
            Point point2 = new Point(A002.x + (this.A0B / 2), A002.y + (this.A0A / 2));
            AnonymousClass5Q9 r3 = new AnonymousClass5Q9();
            AnonymousClass5RL r4 = A0A2.A01;
            if (r4 != null) {
                A042 = r4.A01(point);
            } else {
                A042 = C108975ds.A04(A0A2.A00.A05((float) point.x, (float) point.y));
            }
            r3.A01(A042);
            if (r4 != null) {
                A043 = r4.A01(point2);
            } else {
                A043 = C108975ds.A04(A0A2.A00.A05((float) point2.x, (float) point2.y));
            }
            r3.A01(A043);
            LatLngBounds A003 = r3.A00();
            for (C105735We r1 : this.A1Q) {
                if (A003.A00(r1.A00())) {
                    return r1;
                }
            }
        }
        return null;
    }

    public final void A0Q(C105735We r10) {
        ArrayList A0s2 = AnonymousClass001.A0s();
        List<C105735We> list = this.A1Q;
        synchronized (list) {
            if (r10 == null) {
                this.A0l = null;
                for (C105735We r0 : list) {
                    A0s2.add(new C105735We(this.A1K, r0.A04, 0));
                }
            } else {
                for (C105735We r4 : list) {
                    if (r4 == r10) {
                        A0s2.add(new C105735We(this.A1K, r4.A04, 1));
                        this.A0l = r4;
                    } else {
                        A0s2.add(new C105735We(this.A1K, r4.A04, 2));
                    }
                }
            }
            list.clear();
            list.addAll(A0s2);
            this.A0t = false;
        }
    }

    public void A0S(C105735We r6, boolean z) {
        A0Q(r6);
        List list = r6.A04;
        if (list.size() == 1) {
            A0U((C54942pX) C18290x4.A0k(list));
            return;
        }
        this.A0o = null;
        List list2 = this.A1R;
        list2.clear();
        list2.addAll(list);
        Collections.sort(list2, new C117775sT(this.A0z, this.A14, this.A17));
        this.A0i.A05();
        A0G();
        if (z) {
            A0I();
        }
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public static double A00(double d) {
        double sin = Math.sin((d * 3.141592653589793d) / 180.0d);
        return Math.max(Math.min(Math.log((sin + 1.0d) / (1.0d - sin)) / 2.0d, 3.141592653589793d), -3.141592653589793d) / 2.0d;
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public C111445i6(C111095hX r5, C159027ky r6, C69263Wi r7, C56972sr r8, C29411im r9, C29301ib r10, AnonymousClass5UX r11, C64773Ex r12, C29421in r13, AnonymousClass5ZU r14, C114015mM r15, C613330g r16, C56612sH r17, AnonymousClass5ZR r18, C620733j r19, C29431io r20, C29241iV r21, C621233o r22, C28071fd r23, C61222zu r24) {
        this.A1A = r17;
        this.A0y = r7;
        this.A0z = r8;
        this.A0w = r5;
        this.A18 = r15;
        this.A1K = r23;
        this.A13 = r11;
        this.A14 = r12;
        this.A17 = r14;
        this.A1C = r19;
        this.A16 = r13;
        this.A1E = r20;
        this.A10 = r9;
        this.A12 = r10;
        this.A0x = r6;
        AnonymousClass5ZR r1 = r18;
        this.A1B = r1;
        this.A1J = r22;
        this.A0r = r1.A05();
        this.A19 = r16;
        this.A1G = r21;
        this.A1L = r24;
    }
}
