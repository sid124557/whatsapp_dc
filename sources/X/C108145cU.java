package X;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.jid.UserJid;
import com.whatsapp.location.LocationPicker;
import com.whatsapp.location.LocationPicker2;
import com.whatsapp.location.LocationSharingService;
import com.whatsapp.location.PlaceInfo;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.search.WDSSearchBar;
import com.whatsapp.wds.components.search.WDSSearchView;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.5cU  reason: invalid class name and case insensitive filesystem */
public abstract class C108145cU implements LocationListener {
    public int A00;
    public int A01 = -1;
    public int A02;
    public int A03;
    public int A04;
    public Bitmap A05;
    public Location A06;
    public Handler A07;
    public Handler A08;
    public HandlerThread A09;
    public View A0A;
    public View A0B;
    public View A0C;
    public View A0D;
    public View A0E;
    public View A0F;
    public View A0G;
    public View A0H;
    public View A0I;
    public View A0J;
    public View A0K;
    public View A0L;
    public View A0M;
    public View A0N;
    public View A0O;
    public View A0P;
    public View A0Q;
    public ImageView A0R;
    public ImageView A0S;
    public ListView A0T;
    public ProgressBar A0U;
    public ProgressBar A0V;
    public TextView A0W;
    public C009707r A0X;
    public C141956wP A0Y;
    public C95814uZ A0Z;
    public C102935Kv A0a;
    public AnonymousClass7T7 A0b;
    public C117185rW A0c;
    public AnonymousClass558 A0d;
    public C87134Od A0e;
    public PlaceInfo A0f;
    public C109005dv A0g;
    public C54722pB A0h;
    public WDSSearchBar A0i;
    public Runnable A0j;
    public Runnable A0k;
    public String A0l;
    public Map A0m;
    public boolean A0n = true;
    public boolean A0o = false;
    public boolean A0p = false;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s = false;
    public boolean A0t;
    public boolean A0u = false;
    public boolean A0v = true;
    public final C111095hX A0w;
    public final C55682qk A0x;
    public final C159027ky A0y;
    public final C69263Wi A0z;
    public final C56972sr A10;
    public final C56492s4 A11;
    public final C621033m A12;
    public final AnonymousClass5UX A13;
    public final C56422rx A14;
    public final C48952fk A15;
    public final C613330g A16;
    public final AnonymousClass5U6 A17;
    public final C620633i A18;
    public final C56612sH A19;
    public final C54292oU A1A;
    public final AnonymousClass5ZR A1B;
    public final AnonymousClass33p A1C;
    public final C620733j A1D;
    public final C56982ss A1E;
    public final AnonymousClass487 A1F;
    public final AnonymousClass5IY A1G;
    public final C27821ej A1H;
    public final AnonymousClass5Y0 A1I;
    public final EmojiSearchProvider A1J;
    public final AnonymousClass1VX A1K;
    public final AnonymousClass33K A1L;
    public final C621233o A1M;
    public final C28071fd A1N;
    public final PlaceInfo A1O = new PlaceInfo();
    public final AnonymousClass5OZ A1P;
    public final WhatsAppLibLoader A1Q;
    public final C60152y5 A1R;
    public final C55832qz A1S;
    public final C66433Lk A1T;
    public final C105895Wv A1U;
    public final AnonymousClass4FS A1V;

    public abstract int A00();

    public Dialog A01(int i) {
        C1891190b r2;
        C19340zH r1;
        int i2;
        int i3;
        int i4;
        Uri A002;
        int i5 = i;
        if (i5 != 2) {
            int i6 = 3;
            if (i5 != 3) {
                i6 = 4;
                if (i5 != 4) {
                    r2 = null;
                    if (i5 != 5) {
                        return null;
                    }
                    r1 = AnonymousClass5V0.A00(this.A0X);
                    r1.A0U(R.string.f11nameremoved);
                    i2 = R.string.f11nameremoved;
                }
            }
            View A0F2 = C86604Kt.A0F(this.A0X.getLayoutInflater(), R.layout.f8nameremoved);
            ImageView A0E2 = AnonymousClass0x9.A0E(A0F2, R.id.header_logo);
            C009707r r12 = this.A0X;
            if (i6 != 3) {
                i3 = R.string.f11nameremoved;
            } else {
                i3 = R.string.f11nameremoved;
            }
            C18300x5.A13(r12, A0E2, i3);
            int i7 = R.drawable.nux_live_location;
            if (i6 != 3) {
                i7 = R.drawable.nux_location;
            }
            A0E2.setImageResource(i7);
            TextEmojiLabel A0M2 = C86644Kx.A0M(A0F2, R.id.location_new_user_description);
            Context context = this.A1A.A00;
            AnonymousClass1VX r5 = this.A1K;
            C69263Wi r15 = this.A0z;
            C111095hX r14 = this.A0w;
            C620633i r11 = this.A18;
            C009707r r22 = this.A0X;
            if (i6 != 3) {
                i4 = R.string.f11nameremoved;
            } else {
                boolean A0X2 = r5.A0X(332);
                i4 = R.string.f11nameremoved;
                if (A0X2) {
                    i4 = R.string.f11nameremoved;
                }
            }
            String A0X3 = AnonymousClass0x2.A0X(r22, "learn-more", 1, i4);
            boolean A0X4 = r5.A0X(332);
            C66433Lk r10 = this.A1T;
            if (A0X4) {
                Uri.Builder A012 = r10.A01();
                A012.appendPath("android");
                A012.appendPath("chats");
                A012.appendPath("how-to-use-location-features");
                r10.A05(A012);
                A002 = A012.build();
            } else {
                A002 = C66433Lk.A00(r10, "26000049");
            }
            C620633i r17 = r11;
            C107635bd.A0E(context, A002, r14, r15, A0M2, r17, r5, A0X3, "learn-more");
            C19340zH A022 = AnonymousClass5V0.A02(this.A0X, A0F2);
            A022.A0i(true);
            A022.A0W(new AnonymousClass913(this, i6, 0), R.string.f11nameremoved);
            A022.A0V(new C1891590f(this, 5));
            boolean A0X5 = r5.A0X(332);
            int i8 = R.string.f11nameremoved;
            if (A0X5) {
                i8 = R.string.f11nameremoved;
            }
            A022.A0Y(new AnonymousClass69W(this, i6, 1), i8);
            return A022.create();
        }
        r2 = new C1891190b(this, 40);
        r1 = AnonymousClass5V0.A00(this.A0X);
        r1.A0U(R.string.f11nameremoved);
        i2 = R.string.f11nameremoved;
        r1.A0T(i2);
        r1.A0i(true);
        r1.A0Y(r2, R.string.f11nameremoved);
        return r1.create();
    }

    public abstract Location A02();

    public void A04() {
        if (this.A0Y == C141956wP.LIVE_LOCATION_MODE || this.A0t) {
            A0S(false);
        }
        this.A0y.A05(this, "location-picker-onresume", 0.0f, 3, 5000, 1000);
        A0P((Float) null, false);
    }

    public final void A06() {
        this.A0t = false;
        C141956wP r2 = this.A0Y;
        C141956wP r1 = C141956wP.LIVE_LOCATION_MODE;
        C009707r r0 = this.A0X;
        if (r2 == r1) {
            r0.finish();
            return;
        }
        View currentFocus = r0.getCurrentFocus();
        if (currentFocus != null) {
            this.A1U.A02(currentFocus);
        }
        if (this.A0A != null) {
            this.A0J.clearAnimation();
            if (this.A0J.getVisibility() == 0) {
                A0O((Float) null, false);
                C188748zQ r22 = new C188748zQ(this, 2);
                r22.setDuration(350);
                C86624Kv.A19(r22, this, 8);
                r22.setInterpolator(new AccelerateInterpolator());
                this.A0J.startAnimation(r22);
            } else {
                this.A0J.setVisibility(8);
                A0F(0);
            }
            if (this.A0b != null) {
                this.A0A.clearAnimation();
                int visibility = this.A0A.getVisibility();
                View view = this.A0A;
                if (visibility != 0) {
                    view.setVisibility(0);
                    A0O((Float) null, false);
                    AnonymousClass7T7 r4 = this.A0b;
                    C188998zp r3 = new C188998zp(this, 9);
                    C188748zQ r23 = new C188748zQ(r4, 0);
                    r23.setAnimationListener(new C188988zo(r3, 4, r4));
                    C86624Kv.A18(r23, 400);
                    r4.A01.startAnimation(r23);
                    return;
                }
                view.setVisibility(0);
                if (this.A0A.getHeight() == 0) {
                    AnonymousClass6AE.A00(this.A0A.getViewTreeObserver(), this, 4);
                    return;
                }
                this.A0b.A00(C86664Kz.A02(this.A0A));
                A0J(A02(), (String) null, A00(), false, true);
                A0P((Float) null, true);
                return;
            }
            return;
        }
        A0O((Float) null, false);
        A0J(A02(), (String) null, A00(), false, true);
        A0P((Float) null, true);
    }

    public abstract void A0C();

    public abstract void A0D();

    public abstract void A0G(int i);

    public abstract void A0I(Location location, Float f, int i, boolean z);

    public final void A0J(Location location, String str, int i, boolean z, boolean z2) {
        ProgressBar progressBar;
        this.A08.removeCallbacks(this.A0k);
        if (this.A0p) {
            progressBar = this.A0V;
        } else {
            progressBar = this.A0U;
        }
        progressBar.setVisibility(0);
        this.A0f = null;
        A0C();
        int A042 = C86644Kx.A04(this.A0X, R.id.places_empty);
        this.A0W.setVisibility(A042);
        this.A0M.setVisibility(A042);
        this.A0g = new C109005dv();
        A0B();
        AnonymousClass558 r1 = new AnonymousClass558(location, this, str, i, z, z2);
        this.A0d = r1;
        C18270x1.A0w(r1, this.A1V);
    }

    public void A0O(Float f, boolean z) {
        Object obj;
        PlaceInfo placeInfo;
        Object obj2;
        PlaceInfo placeInfo2;
        Object obj3;
        PlaceInfo placeInfo3;
        Object obj4;
        View view;
        int height;
        PlaceInfo placeInfo4;
        Object obj5;
        AnonymousClass68A r7 = (AnonymousClass68A) this;
        int i = r7.A02;
        Object obj6 = r7.A01;
        if (i != 0) {
            obj = ((LocationPicker2) obj6).A02;
        } else {
            obj = ((LocationPicker) obj6).A03;
        }
        if (AnonymousClass000.A1W(obj)) {
            if (this.A0t) {
                if (C86604Kt.A1Y(this.A0i.A07)) {
                    this.A0i.A02(true);
                }
                this.A0p = false;
                this.A0R.setVisibility(8);
                this.A0P.setVisibility(8);
            } else {
                AnonymousClass5ZR r3 = this.A1B;
                if (r3.A05()) {
                    Object obj7 = r7.A01;
                    if (i != 0) {
                        LocationPicker2 locationPicker2 = (LocationPicker2) obj7;
                        if (locationPicker2.A02 != null && locationPicker2.A0N.A05()) {
                            locationPicker2.A02.A0L(true);
                        }
                    } else {
                        LocationPicker locationPicker = (LocationPicker) obj7;
                        if (locationPicker.A03 != null && locationPicker.A0H.A05()) {
                            locationPicker.A03.A0E(true);
                        }
                    }
                }
                A0C();
                A0D();
                this.A0R.setVisibility(0);
                if (this.A0p) {
                    this.A0R.setImageResource(R.drawable.btn_map_fullscreen_off);
                    C18300x5.A13(this.A0X, this.A0R, R.string.f11nameremoved);
                    if (this.A0o) {
                        ImageView A0F2 = AnonymousClass0x9.A0F(this.A0T, R.id.send_current_location_icon);
                        if (A0F2 != null) {
                            A0F2.setImageResource(R.drawable.ic_current_location);
                        }
                        TextView A092 = AnonymousClass002.A09(this.A0T, R.id.send_current_location_text);
                        if (A092 != null) {
                            A092.setText(R.string.f11nameremoved);
                        }
                    }
                    TextView A0L2 = C18310x6.A0L(this.A0X, R.id.location_picker_current_location_text);
                    if (A0U() && A0L2 != null) {
                        A0L2.setText(R.string.f11nameremoved);
                    }
                    Object obj8 = r7.A01;
                    if (i != 0) {
                        LocationPicker2 locationPicker22 = (LocationPicker2) obj8;
                        if (!(locationPicker22.A02 == null || (placeInfo4 = locationPicker22.A0X.A0f) == null || (obj5 = placeInfo4.A0D) == null)) {
                            C105345Uo r1 = (C105345Uo) obj5;
                            r1.A05(locationPicker22.A05);
                            r1.A04();
                        }
                    } else {
                        LocationPicker locationPicker3 = (LocationPicker) obj8;
                        if (!(locationPicker3.A03 == null || (placeInfo3 = locationPicker3.A0P.A0f) == null || (obj4 = placeInfo3.A0D) == null)) {
                            C88534Zc r12 = (C88534Zc) obj4;
                            r12.A0G(locationPicker3.A06);
                            r12.A0D();
                        }
                    }
                    this.A0W.setVisibility(8);
                    View view2 = this.A0A;
                    View view3 = this.A0P;
                    if (view2 != null) {
                        view3.setVisibility(0);
                        this.A0T.setAdapter((ListAdapter) null);
                        this.A0T.setOnScrollListener((AbsListView.OnScrollListener) null);
                        if (this.A0o) {
                            height = C86664Kz.A0C(this.A0H, C86664Kz.A0C(this.A0T.findViewById(R.id.send_current_location_btn), this.A0T.findViewById(R.id.nearby_places_header).getHeight()));
                        } else {
                            height = this.A0F.getHeight();
                        }
                        C86624Kv.A0w(this.A0O, height);
                        A0N(f, height, true);
                    } else {
                        view3.setVisibility(8);
                    }
                    PlaceInfo placeInfo5 = this.A0f;
                    if ((placeInfo5 == null || placeInfo5.A0D == null) && (!C86604Kt.A1Y(this.A0i.A07) || !C105895Wv.A00(this.A0Q))) {
                        this.A0E.setVisibility(0);
                        this.A0X.invalidateOptionsMenu();
                    }
                    view = this.A0E;
                    view.setVisibility(8);
                    this.A0X.invalidateOptionsMenu();
                }
                if (this.A0o) {
                    ImageView A0F3 = AnonymousClass0x9.A0F(this.A0T, R.id.send_current_location_icon);
                    if (A0F3 != null) {
                        A0F3.setImageResource(R.drawable.btn_send_current_location);
                    }
                    TextView A093 = AnonymousClass002.A09(this.A0T, R.id.send_current_location_text);
                    if (A093 != null) {
                        A093.setText(R.string.f11nameremoved);
                    }
                    A0A();
                }
                TextView A0L3 = C18310x6.A0L(this.A0X, R.id.location_picker_current_location_text);
                if (A0U() && A0L3 != null) {
                    A0L3.setText(R.string.f11nameremoved);
                }
                this.A0R.setImageResource(R.drawable.btn_map_fullscreen_on);
                C18300x5.A13(this.A0X, this.A0R, R.string.f11nameremoved);
                Object obj9 = r7.A01;
                if (i != 0) {
                    LocationPicker2 locationPicker23 = (LocationPicker2) obj9;
                    if (!(locationPicker23.A02 == null || (placeInfo2 = locationPicker23.A0X.A0f) == null || (obj3 = placeInfo2.A0D) == null)) {
                        C105345Uo r13 = (C105345Uo) obj3;
                        r13.A05(locationPicker23.A05);
                        r13.A03();
                    }
                } else {
                    LocationPicker locationPicker4 = (LocationPicker) obj9;
                    if (!(locationPicker4.A03 == null || (placeInfo = locationPicker4.A0P.A0f) == null || (obj2 = placeInfo.A0D) == null)) {
                        C88534Zc r14 = (C88534Zc) obj2;
                        r14.A0G(locationPicker4.A06);
                        r14.A0C();
                    }
                }
                C86624Kv.A11(this.A0P, r3.A05() ? 1 : 0, 0, 8);
                A09();
                if (this.A0A != null) {
                    int i2 = this.A04;
                    if (C105895Wv.A00(this.A0Q)) {
                        i2 /= 2;
                    }
                    C86624Kv.A0w(this.A0O, i2);
                    if (r3.A05()) {
                        A0N(f, i2, z);
                    }
                    this.A0T.setAdapter(this.A0e);
                    A07();
                }
            }
            this.A0E.setVisibility(8);
            view = this.A0B;
            view.setVisibility(8);
            this.A0X.invalidateOptionsMenu();
        }
    }

    public abstract void A0T(boolean z);

    public void A03() {
        Handler handler = this.A08;
        if (handler != null) {
            handler.removeCallbacks(this.A0k);
        }
        AnonymousClass558 r1 = this.A0d;
        if (r1 != null) {
            r1.A0D(true);
            this.A0d = null;
        }
        this.A0h.A00();
        C102935Kv r2 = this.A0a;
        r2.A01.getViewTreeObserver().removeGlobalOnLayoutListener(r2.A02);
        r2.A07.A0C();
        this.A09.quit();
        this.A17.A02(8);
    }

    public final void A05() {
        C86604Kt.A1A(this.A0T.findViewById(R.id.location_description));
        boolean z = !this.A0p;
        this.A0p = z;
        float f = -0.5f;
        if (z) {
            f = 0.5f;
        }
        A0P(Float.valueOf(f), true);
    }

    public final void A07() {
        int indexOf;
        PlaceInfo placeInfo = this.A0f;
        if (placeInfo != null && (indexOf = this.A0g.A0F.indexOf(placeInfo)) >= 0) {
            A0B();
            ListView listView = this.A0T;
            listView.smoothScrollToPosition(indexOf + listView.getHeaderViewsCount());
        }
    }

    public final void A08() {
        Intent A072;
        C141956wP r0 = this.A0Y;
        C141956wP r3 = C141956wP.EVENT_MODE;
        if (r0 == r3 || !this.A1K.A0X(332) || !C86654Ky.A1T(AnonymousClass0x2.A0F(this.A1C), "nearby_location_new_user")) {
            this.A17.A03(8);
            C141956wP r2 = this.A0Y;
            if (r2 == r3) {
                A072 = C18320x8.A07();
                A072.putExtra("locations_string", this.A0l);
                PlaceInfo placeInfo = this.A1O;
                A072.putExtra("longitude", placeInfo.A02);
                A072.putExtra("latitude", placeInfo.A01);
                A072.putExtra("address", this.A0l);
            } else if (r2 == C141956wP.STICKER_MODE) {
                A072 = C18320x8.A07();
                A072.putExtra("locations_string", this.A0l);
                PlaceInfo placeInfo2 = this.A1O;
                A072.putExtra("longitude", placeInfo2.A02);
                A072.putExtra("latitude", placeInfo2.A01);
            } else {
                Location location = this.A06;
                C624134x r6 = null;
                if (location != null && location.getAccuracy() > 200.0f) {
                    location = null;
                }
                long longExtra = this.A0X.getIntent().getLongExtra("quoted_message_row_id", 0);
                C27991fJ A0c2 = C86604Kt.A0c(this.A0X);
                if (longExtra > 0) {
                    r6 = C55122pp.A00(this.A1S, longExtra);
                } else if (A0c2 != null) {
                    r6 = C385328b.A00(A0c2, (String) null, (String) null, this.A19.A0H());
                }
                C95814uZ r22 = this.A0Z;
                if (r22 != null) {
                    C621033m r32 = this.A12;
                    C626936e.A06(r22);
                    boolean A1N2 = AnonymousClass0x9.A1N(this.A0X.getIntent(), "has_number_from_url");
                    Log.d("UserActions/userActionSendStaticLocation");
                    AnonymousClass2z0 A012 = AnonymousClass35J.A01(r22, r32.A1X);
                    C56612sH r11 = r32.A0V;
                    AnonymousClass1n9 r02 = new AnonymousClass1n9(A012, r11.A0H());
                    if (location != null) {
                        r02.A00 = location.getLatitude();
                        r02.A01 = location.getLongitude();
                    }
                    r02.A1G(1);
                    r32.A1a.A00(r02, r6);
                    if (A1N2) {
                        r02.A1B(4);
                    }
                    r32.A0O(r02);
                    C66543Lv r13 = r32.A0l;
                    r13.A0a(r02, 2);
                    C55682qk r7 = r32.A00;
                    C56492s4 r9 = r32.A08;
                    C29431io r14 = r32.A0u;
                    AnonymousClass33K r23 = r32.A1E;
                    C34071uB r62 = new C34071uB(r7, r32.A01, r9, r32.A0S, r11, r32.A0Y, r13, r14, r32.A0v, r23, r32.A1G, r02);
                    r62.A01 = 15;
                    C18270x1.A0w(r62, r32.A1r);
                }
                C009707r r33 = this.A0X;
                Intent A073 = C18320x8.A07();
                Map map = this.A0m;
                if (map != null) {
                    A073.putExtra("carry_forward_extras", new HashMap(map));
                }
                r33.setResult(-1, A073);
                this.A0X.finish();
                return;
            }
            this.A0X.setResult(-1, A072);
            this.A0X.finish();
            return;
        }
        this.A0j = new C71533cG((Object) this, 16);
        C621433s.A01(this.A0X, 4);
    }

    public final void A09() {
        String str;
        C109005dv r0 = this.A0g;
        if (r0 == null || r0.A0F.isEmpty()) {
            str = null;
        } else {
            C109005dv r2 = this.A0g;
            if (r2.A0D == 3) {
                str = AnonymousClass002.A0F(this.A0X, "<a href='https://foursquare.com/'>foursquare</a>", AnonymousClass002.A0L(), 0, R.string.f11nameremoved);
            } else {
                str = r2.A03;
            }
        }
        this.A0M.setVisibility(8);
        if (str == null || this.A0p) {
            this.A0W.setVisibility(8);
            return;
        }
        C18280x3.A1E(str, this.A0W);
        this.A0W.setVisibility(0);
    }

    public final void A0A() {
        View findViewById;
        String A0p2;
        if (!this.A0o) {
            findViewById = this.A0X.findViewById(R.id.location_accuracy);
        } else if (!this.A0p) {
            findViewById = this.A0G.findViewById(R.id.location_description);
        } else {
            return;
        }
        TextView textView = (TextView) findViewById;
        if (textView != null) {
            if (A0U() && !TextUtils.isEmpty(this.A0l)) {
                textView.setVisibility(0);
                A0p2 = this.A0l;
            } else if (A0U() || this.A01 <= 0) {
                textView.setVisibility(8);
                return;
            } else {
                textView.setVisibility(0);
                A0p2 = C86604Kt.A0p(this.A1D, this.A01, R.plurals.f9nameremoved);
            }
            textView.setText(A0p2);
        }
    }

    public final void A0B() {
        List list;
        C87134Od r1 = this.A0e;
        C109005dv r0 = this.A0g;
        if (r0 != null) {
            list = r0.A0F;
        } else {
            list = null;
        }
        r1.A01 = list;
        r1.A00 = this.A0f;
        r1.notifyDataSetChanged();
    }

    public void A0E(double d, double d2) {
        PlaceInfo placeInfo = this.A1O;
        placeInfo.A01 = d;
        placeInfo.A02 = d2;
        placeInfo.A06 = null;
        placeInfo.A04 = null;
        if ((this.A0p && !this.A0s) || (A0U() && TextUtils.isEmpty(this.A0l))) {
            if (this.A0f == null && (this.A0o || this.A0u)) {
                this.A0B.setVisibility(0);
            }
            this.A07.removeCallbacks(this.A0c);
            C117185rW r1 = new C117185rW(this, d, d2);
            this.A0c = r1;
            this.A07.post(r1);
        }
    }

    public final void A0F(int i) {
        this.A02 = i;
        int max = Math.max(this.A00, i);
        this.A0K.setPadding(0, 0, 0, max);
        this.A0K.requestLayout();
        A0G(max);
    }

    public void A0K(Bundle bundle) {
        bundle.putParcelable("places", this.A0g);
        bundle.putBoolean("show_live_location_setting", this.A0t);
        bundle.putBoolean("fullscreen", this.A0p);
        bundle.putBoolean("zoom_to_user", this.A0v);
    }

    public void A0L(Bundle bundle, C009707r r34) {
        UserJid A082;
        C95814uZ r4;
        int i;
        LocationManager A0F2;
        C009707r r2 = r34;
        this.A0X = r2;
        AnonymousClass1VX r9 = this.A1K;
        boolean A002 = C154437dA.A00(r9);
        Bitmap bitmap = null;
        LayoutInflater layoutInflater = r2.getLayoutInflater();
        int i2 = R.layout.f8nameremoved;
        if (A002) {
            i2 = R.layout.f8nameremoved;
        }
        View inflate = layoutInflater.inflate(i2, (ViewGroup) null, false);
        TextView A092 = AnonymousClass002.A09(inflate, R.id.duration_15_min);
        Object[] objArr = new Object[1];
        AnonymousClass000.A1P(objArr, 15, 0);
        AnonymousClass001.A0y(r2, A092, objArr, R.string.f11nameremoved);
        TextView A093 = AnonymousClass002.A09(inflate, R.id.duration_60_min);
        Object[] objArr2 = new Object[1];
        AnonymousClass000.A1P(objArr2, 1, 0);
        AnonymousClass001.A0y(r2, A093, objArr2, R.string.f11nameremoved);
        TextView A094 = AnonymousClass002.A09(inflate, R.id.duration_480_min);
        Object[] objArr3 = new Object[1];
        AnonymousClass000.A1P(objArr3, 8, 0);
        AnonymousClass001.A0y(r2, A094, objArr3, R.string.f11nameremoved);
        r2.setContentView(inflate);
        if (!this.A1Q.A03()) {
            Log.i("aborting due to native libraries missing");
        } else {
            C56972sr r11 = this.A10;
            r11.A0P();
            if (r11.A00 != null) {
                Bundle bundle2 = bundle;
                if (bundle != null) {
                    this.A0g = (C109005dv) bundle2.getParcelable("places");
                    this.A0t = bundle2.getBoolean("show_live_location_setting", false);
                    bundle2.remove("places");
                    this.A0p = bundle2.getBoolean("fullscreen", false);
                    this.A0v = bundle2.getBoolean("zoom_to_user", false);
                }
                this.A0Z = C106405Yw.A00(this.A0X);
                this.A0u = this.A0X.getIntent().getBooleanExtra("start_in_fullscreen_mode", false);
                Bundle A0D2 = C86614Ku.A0D(this.A0X);
                if (A0D2 != null && (A0D2.getSerializable("carry_forward_extras") instanceof Map)) {
                    this.A0m = (Map) A0D2.getSerializable("carry_forward_extras");
                }
                C95814uZ r42 = this.A0Z;
                if (r42 == null) {
                    A082 = null;
                } else {
                    A082 = AnonymousClass32Y.A08(r42.getRawString());
                }
                C623134n r6 = new C623134n(this.A14, this.A15, A082);
                boolean z = false;
                if ((!r9.A0X(1506) || A082 == null || !r6.A02()) && ((!(this.A0Z instanceof UserJid) || !r9.A0X(5968) || (!r6.A03() && !r6.A05())) && ((!r9.A0X(2515) || !((i = r6.A03.hostStorage) == 2 || i == 1)) && ((!C627336j.A0L(this.A0Z) || r9.A0X(2584)) && (r4 = this.A0Z) != null && !(r4 instanceof AnonymousClass1fS))))) {
                    z = true;
                }
                this.A0o = z;
                if (r2.getIntent() != null) {
                    this.A0Y = C141956wP.values()[r2.getIntent().getIntExtra("mode", 0)];
                }
                this.A0Q = C005205m.A00(r2, R.id.main);
                C166967zY r13 = new C166967zY(this);
                WDSSearchBar wDSSearchBar = (WDSSearchBar) r2.findViewById(R.id.wds_search_bar);
                this.A0i = wDSSearchBar;
                WDSSearchView wDSSearchView = wDSSearchBar.A07;
                wDSSearchView.setOnQueryTextSubmitListener(new C1896692e(this, 0));
                wDSSearchView.setTrailingButtonIcon(C140036t3.A00);
                this.A0i.addOnLayoutChangeListener(new AnonymousClass91C(wDSSearchView, 2, r13));
                r2.setSupportActionBar(this.A0i.A06);
                AnonymousClass0R8 supportActionBar = r2.getSupportActionBar();
                supportActionBar.A0N(true);
                if (A0U()) {
                    supportActionBar.A0B(R.string.f11nameremoved);
                } else {
                    supportActionBar.A0B(R.string.f11nameremoved);
                }
                if (r9.A0X(6260)) {
                    AnonymousClass5XO.A00(r2, supportActionBar);
                }
                View findViewById = r2.findViewById(R.id.map_frame);
                this.A0L = findViewById;
                if (findViewById != null) {
                    C86614Ku.A1J(findViewById.getViewTreeObserver(), this, 10);
                }
                this.A0O = r2.findViewById(R.id.picker_list);
                this.A0P = r2.findViewById(R.id.places_holder);
                this.A0E = r2.findViewById(R.id.map_center);
                View findViewById2 = r2.findViewById(R.id.map_center_pin);
                this.A0D = findViewById2;
                C18300x5.A13(r2, findViewById2, R.string.f11nameremoved);
                this.A0C = r2.findViewById(R.id.map_center_filler);
                View A003 = C005205m.A00(r2, R.id.map_center_info);
                this.A0B = A003;
                C18290x4.A1F(A003, this, 21);
                View findViewById3 = this.A0X.findViewById(R.id.send_my_location_btn);
                this.A0F = findViewById3;
                C18290x4.A1F(findViewById3, this, 18);
                View findViewById4 = this.A0X.findViewById(R.id.live_location_btn);
                this.A0H = findViewById4;
                findViewById4.setVisibility(C86614Ku.A01(r11.A0Y() ? 1 : 0));
                C18290x4.A1F(this.A0H, this, 19);
                ImageView A0u2 = C86664Kz.A0u(r2, R.id.full_screen);
                this.A0R = A0u2;
                C18290x4.A1F(A0u2, this, 20);
                Handler A0A2 = AnonymousClass000.A0A();
                this.A08 = A0A2;
                C71533cG r12 = new C71533cG((Object) this, 17);
                this.A0k = r12;
                if (this.A0g == null) {
                    A0A2.postDelayed(r12, 15000);
                }
                File A0A3 = AnonymousClass002.A0A(r2.getCacheDir(), "Places");
                if (!A0A3.mkdirs() && !A0A3.isDirectory()) {
                    Log.w("LocationPickerUI/create unable to create places directory");
                }
                C47432dF r122 = new C47432dF(this.A0z, this.A11, this.A1L, A0A3, "location-picker");
                r122.A00 = this.A0X.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
                this.A0h = r122.A01();
                this.A0S = C86654Ky.A0M(this.A0X, R.id.my_location);
                this.A0N = this.A0X.findViewById(R.id.permissions_request);
                this.A0I = this.A0X.findViewById(R.id.live_location_setting);
                ProgressBar progressBar = (ProgressBar) C005205m.A00(r2, R.id.progressbar_small);
                this.A0U = progressBar;
                int i3 = 8;
                if (this.A0g == null) {
                    i3 = 0;
                }
                progressBar.setVisibility(i3);
                this.A0V = (ProgressBar) r2.findViewById(R.id.progressbar_map);
                View inflate2 = View.inflate(this.A0X, R.layout.f8nameremoved, (ViewGroup) null);
                TextView A095 = AnonymousClass002.A09(inflate2, R.id.location_picker_attributions_textview);
                this.A0W = A095;
                C86654Ky.A1E(A095);
                View inflate3 = View.inflate(this.A0X, R.layout.f8nameremoved, (ViewGroup) null);
                View findViewById5 = inflate3.findViewById(R.id.location_picker_loading_progress);
                this.A0M = findViewById5;
                findViewById5.setVisibility(8);
                this.A0e = new C87134Od(r2, this.A0h);
                this.A0T = (ListView) this.A0X.findViewById(R.id.places_list);
                if (this.A0o) {
                    this.A0T.addHeaderView(this.A0X.getLayoutInflater().inflate(R.layout.f8nameremoved, (ViewGroup) null), (Object) null, false);
                    View inflate4 = this.A0X.getLayoutInflater().inflate(R.layout.f8nameremoved, (ViewGroup) null);
                    this.A0G = inflate4;
                    this.A0T.addHeaderView(inflate4, (Object) null, true);
                } else {
                    this.A0G = this.A0F;
                }
                this.A0T.setAdapter(this.A0e);
                this.A0T.setFooterDividersEnabled(true);
                this.A0T.addFooterView(inflate2, (Object) null, true);
                this.A0T.addFooterView(inflate3, (Object) null, false);
                A09();
                A0B();
                this.A0T.setOnItemClickListener(new C1237569q(r2, 2, this));
                C167177zt r5 = new C167177zt();
                ((RadioGroup) this.A0X.findViewById(R.id.duration)).setOnCheckedChangeListener(r5);
                C009707r r31 = this.A0X;
                C105895Wv r29 = this.A1U;
                C55682qk r30 = this.A0x;
                AnonymousClass5Y0 r24 = this.A1I;
                C27821ej r20 = this.A1H;
                C620633i r18 = this.A18;
                C620733j r123 = this.A1D;
                AnonymousClass5IY r17 = this.A1G;
                EmojiSearchProvider emojiSearchProvider = this.A1J;
                C60152y5 r15 = this.A1R;
                AnonymousClass487 r14 = this.A1F;
                C60152y5 r28 = r15;
                this.A0a = new C102935Kv(r31, this.A0Q, r30, r18, this.A1C, r123, r14, r17, r20, r24, emojiSearchProvider, r9, this.A0Z, r28, r29);
                ImageView A0M2 = C86654Ky.A0M(this.A0X, R.id.send);
                C18270x1.A0d(this.A0X, A0M2, r123, R.drawable.input_send);
                AnonymousClass54E.A00(A0M2, r5, this, 12);
                View inflate5 = View.inflate(this.A0X, R.layout.f8nameremoved, (ViewGroup) null);
                AnonymousClass1RR A012 = C56972sr.A01(r11);
                if (A012 != null && (bitmap = this.A16.A03(inflate5.getContext(), A012, C18310x6.A01(this.A0X), C86634Kw.A04(this.A0X), true)) == null) {
                    AnonymousClass5UX r8 = this.A13;
                    bitmap = r8.A03(inflate5.getContext(), r8.A00(A012));
                }
                AnonymousClass0x9.A0F(inflate5, R.id.contact_photo).setImageBitmap(bitmap);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                inflate5.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = inflate5.getMeasuredWidth();
                int measuredHeight = inflate5.getMeasuredHeight();
                this.A05 = C86664Kz.A0Y(measuredWidth, measuredHeight);
                inflate5.layout(0, 0, measuredWidth, measuredHeight);
                inflate5.draw(AnonymousClass4L0.A06(this.A05));
                this.A0A = r2.findViewById(R.id.bottom_sheet);
                this.A0K = r2.findViewById(R.id.map_center_frame);
                View view = this.A0A;
                if (view != null) {
                    view.setVisibility(0);
                    this.A0b = new AnonymousClass7T7(r2.getResources(), this.A0A, new AnonymousClass7E2(this));
                } else {
                    this.A0a.A07.setMaxLines(2);
                }
                View findViewById6 = r2.findViewById(R.id.live_location_sheet);
                this.A0J = findViewById6;
                if (findViewById6 != null) {
                    findViewById6.setVisibility(8);
                }
                if (bundle == null && this.A1B.A05() && (A0F2 = r18.A0F()) != null && !A0F2.isProviderEnabled("gps") && !A0F2.isProviderEnabled("network")) {
                    C621433s.A01(this.A0X, 2);
                }
                HandlerThread handlerThread = new HandlerThread("GeoCode");
                this.A09 = handlerThread;
                handlerThread.start();
                this.A07 = new Handler(this.A09.getLooper());
                AnonymousClass54E r43 = new AnonymousClass54E(r2, 13, this);
                C005205m.A00(r2, R.id.button_open_permission_settings).setOnClickListener(r43);
                View findViewById7 = r2.findViewById(R.id.button_open_permission_settings_minimized);
                if (findViewById7 != null) {
                    findViewById7.setOnClickListener(r43);
                }
                if (this.A0u && bundle == null) {
                    A05();
                    return;
                }
                return;
            }
        }
        this.A0X.finish();
    }

    public final void A0M(PlaceInfo placeInfo) {
        C624134x r2;
        C009707r r22;
        Intent A072;
        C141956wP r0 = this.A0Y;
        C141956wP r6 = C141956wP.EVENT_MODE;
        PlaceInfo placeInfo2 = placeInfo;
        if (r0 == r6 || !this.A1K.A0X(332) || !C86654Ky.A1T(AnonymousClass0x2.A0F(this.A1C), "nearby_location_new_user")) {
            C141956wP r23 = this.A0Y;
            if (r23 == r6) {
                A072 = C18320x8.A07();
                A072.putExtra("locations_string", placeInfo2.A06);
                A072.putExtra("longitude", placeInfo2.A02);
                A072.putExtra("latitude", placeInfo2.A01);
                A072.putExtra("address", placeInfo2.A04);
                A072.putExtra("vicinity", placeInfo2.A0B);
            } else if (r23 == C141956wP.STICKER_MODE) {
                A072 = C18320x8.A07();
                A072.putExtra("locations_string", placeInfo2.A06);
                PlaceInfo placeInfo3 = this.A1O;
                A072.putExtra("longitude", placeInfo3.A02);
                A072.putExtra("latitude", placeInfo3.A01);
            } else {
                long longExtra = this.A0X.getIntent().getLongExtra("quoted_message_row_id", 0);
                C27991fJ A0c2 = C86604Kt.A0c(this.A0X);
                if (longExtra > 0) {
                    r2 = C55122pp.A00(this.A1S, longExtra);
                } else {
                    r2 = null;
                    if (A0c2 != null) {
                        r2 = C385328b.A00(A0c2, (String) null, (String) null, this.A19.A0H());
                    }
                }
                C95814uZ r62 = this.A0Z;
                if (r62 != null) {
                    C621033m r10 = this.A12;
                    C626936e.A06(r62);
                    boolean A1N2 = AnonymousClass0x9.A1N(this.A0X.getIntent(), "has_number_from_url");
                    Log.d("UserActions/userActionSendStaticLocation");
                    AnonymousClass2z0 A012 = AnonymousClass35J.A01(r62, r10.A1X);
                    C56612sH r9 = r10.A0V;
                    AnonymousClass1n9 r8 = new AnonymousClass1n9(A012, r9.A0H());
                    r8.A1G(1);
                    r8.A00 = placeInfo2.A01;
                    r8.A01 = placeInfo2.A02;
                    r8.A01 = placeInfo2.A06;
                    r8.A00 = placeInfo2.A04;
                    r8.A02 = placeInfo2.A0A;
                    r10.A1a.A00(r8, r2);
                    if (A1N2) {
                        r8.A1B(4);
                    }
                    r10.A0O(r8);
                    C66543Lv r11 = r10.A0l;
                    r11.A0a(r8, 2);
                    AnonymousClass4FS r7 = r10.A1r;
                    C55682qk r13 = r10.A00;
                    C56492s4 r15 = r10.A08;
                    C29431io r63 = r10.A0u;
                    AnonymousClass33K r3 = r10.A1E;
                    AnonymousClass5ZR r24 = r10.A0Y;
                    C159027ky r14 = r10.A01;
                    C55332qB r1 = r10.A0v;
                    C621233o r02 = r10.A1G;
                    C55332qB r21 = r1;
                    C29431io r20 = r63;
                    C66543Lv r19 = r11;
                    AnonymousClass5ZR r18 = r24;
                    C56612sH r17 = r9;
                    C44382Vv r16 = r10.A0S;
                    C18270x1.A0w(new C34071uB(r13, r14, r15, r16, r17, r18, r19, r20, r21, r3, r02, r8), r7);
                }
                r22 = this.A0X;
                A072 = C18320x8.A07();
                Map map = this.A0m;
                if (map != null) {
                    A072.putExtra("carry_forward_extras", new HashMap(map));
                }
                r22.setResult(-1, A072);
                this.A0X.finish();
                return;
            }
            r22 = this.A0X;
            r22.setResult(-1, A072);
            this.A0X.finish();
            return;
        }
        this.A0j = new C71353by(this, 9, placeInfo2);
        C621433s.A01(this.A0X, 4);
    }

    public final void A0N(Float f, int i, boolean z) {
        this.A0A.clearAnimation();
        A0I(A02(), f, i, z);
        AnonymousClass7T7 r4 = this.A0b;
        if (r4 == null) {
            return;
        }
        if (z) {
            View view = r4.A01;
            AnonymousClass6F3 r2 = new AnonymousClass6F3(view, r4, i);
            r2.setDuration((long) ((int) (((float) i) / r4.A00.getDisplayMetrics().density)));
            view.startAnimation(r2);
            return;
        }
        View view2 = r4.A01;
        C86624Kv.A0w(view2, i);
        view2.requestLayout();
        r4.A00((float) i);
    }

    public void A0P(Float f, boolean z) {
        boolean A052 = this.A1B.A05();
        LocationSharingService.A04(this.A1A.A00, this.A1M);
        if (A052) {
            this.A0S.setVisibility(0);
            this.A0N.setVisibility(8);
            if (this.A0t) {
                this.A0F.setVisibility(8);
                this.A0P.setVisibility(8);
                this.A0H.setVisibility(8);
                if (this.A0J == null) {
                    this.A0I.setVisibility(0);
                }
            } else {
                this.A0P.setVisibility(0);
                boolean z2 = this.A0o;
                View view = this.A0H;
                if (z2) {
                    view.setVisibility(0);
                    this.A0F.setVisibility(8);
                } else {
                    view.setVisibility(8);
                    this.A0F.setVisibility(0);
                }
                if (this.A0J == null) {
                    this.A0I.setVisibility(8);
                }
            }
            View findViewById = this.A0X.findViewById(R.id.permissions_request_minimized);
            if (findViewById != null) {
                findViewById.setVisibility(4);
                this.A03 = (int) (((double) this.A0L.getMeasuredHeight()) * 0.66d);
                ViewGroup.LayoutParams layoutParams = this.A0N.getLayoutParams();
                int i = this.A03;
                layoutParams.height = i;
                A0N((Float) null, i, false);
            }
            A0O(f, z);
            return;
        }
        this.A0F.setVisibility(8);
        this.A0H.setVisibility(8);
        this.A0P.setVisibility(8);
        this.A0S.setVisibility(8);
        if (this.A0J == null) {
            this.A0I.setVisibility(8);
        }
        AnonymousClass33p r2 = this.A1C;
        C18270x1.A0l(C18270x1.A03(r2), "live_location_is_new_user", true);
        C18270x1.A0l(C18270x1.A03(r2), "nearby_location_new_user", true);
        View findViewById2 = this.A0X.findViewById(R.id.permissions_request_minimized);
        this.A0E.setVisibility(8);
        boolean z3 = this.A0p;
        ImageView imageView = this.A0R;
        if (z3) {
            imageView.setImageResource(R.drawable.btn_map_fullscreen_off);
            if (findViewById2 != null) {
                findViewById2.setVisibility(0);
                if (findViewById2.getMeasuredHeight() > 0) {
                    A0N(f, findViewById2.getMeasuredHeight(), z);
                } else {
                    findViewById2.getViewTreeObserver().addOnGlobalLayoutListener(new C166977zZ(findViewById2, this, f));
                }
            }
            this.A0N.setVisibility(8);
            return;
        }
        imageView.setImageResource(R.drawable.btn_map_fullscreen_on);
        this.A0N.setVisibility(0);
        if (findViewById2 != null) {
            findViewById2.setVisibility(4);
            if (this.A03 > 0) {
                ViewGroup.LayoutParams layoutParams2 = this.A0N.getLayoutParams();
                int i2 = this.A03;
                layoutParams2.height = i2;
                A0N(f, i2, z);
            }
        }
    }

    public void A0Q(Object obj) {
        Iterator it = this.A0g.A0F.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            PlaceInfo placeInfo = (PlaceInfo) it.next();
            if (obj.equals(placeInfo.A0D)) {
                this.A0f = placeInfo;
                break;
            }
        }
        A07();
    }

    public void A0R(String str, Object obj) {
        if (str != null) {
            for (PlaceInfo placeInfo : this.A0g.A0F) {
                if (obj.equals(placeInfo.A0D)) {
                    A0M(placeInfo);
                    return;
                }
            }
        }
    }

    public final void A0S(boolean z) {
        C009707r r1;
        int i;
        if (this.A10.A0Y()) {
            r1 = this.A0X;
            i = 5;
        } else if (AnonymousClass0x2.A0F(this.A1C).getBoolean("live_location_is_new_user", true)) {
            r1 = this.A0X;
            i = 3;
        } else {
            LocationManager A0F2 = this.A18.A0F();
            if (A0F2 != null && !A0F2.isProviderEnabled("gps") && !A0F2.isProviderEnabled("network")) {
                r1 = this.A0X;
                i = 2;
            } else if (!this.A1B.A05()) {
                this.A0t = false;
                A0P((Float) null, false);
                return;
            } else {
                this.A0g = new C109005dv();
                this.A0t = true;
                View view = this.A0A;
                if (view != null) {
                    if (this.A0b != null) {
                        view.clearAnimation();
                        AnonymousClass7T7 r5 = this.A0b;
                        if (z) {
                            View view2 = r5.A01;
                            if (view2.getVisibility() == 0) {
                                C188748zQ r2 = new C188748zQ(r5, 1);
                                C86624Kv.A19(r2, r5, 7);
                                C86624Kv.A18(r2, 350);
                                view2.startAnimation(r2);
                            }
                        }
                        r5.A01.setVisibility(8);
                        r5.A00(0.0f);
                    }
                    this.A0J.clearAnimation();
                    if (!z || this.A0J.getVisibility() == 0) {
                        this.A0J.setVisibility(0);
                        int height = this.A0J.getHeight();
                        View view3 = this.A0J;
                        if (height == 0) {
                            view3.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass91Y(this, 3));
                            return;
                        }
                        A0F(view3.getHeight());
                        A0T(false);
                        A0O((Float) null, false);
                        return;
                    }
                    this.A0J.setVisibility(0);
                    A0O((Float) null, false);
                    C188748zQ r22 = new C188748zQ(this, 3);
                    r22.setDuration(400);
                    C86624Kv.A19(r22, this, 10);
                    r22.setInterpolator(new AccelerateInterpolator());
                    this.A0J.startAnimation(r22);
                    return;
                }
                A0T(true);
                A0P((Float) null, true);
                return;
            }
        }
        C621433s.A01(r1, i);
    }

    public final boolean A0U() {
        C141956wP r2 = this.A0Y;
        if (r2 == C141956wP.STICKER_MODE || r2 == C141956wP.EVENT_MODE) {
            return true;
        }
        return false;
    }

    public void onLocationChanged(Location location) {
        int i;
        if (C622534h.A01(location, this.A06)) {
            boolean z = true;
            if (location.hasAccuracy()) {
                i = Math.max(1, (int) location.getAccuracy());
            } else {
                i = -1;
            }
            if (i != this.A01) {
                this.A01 = i;
            }
            A0A();
            C109005dv r0 = this.A0g;
            if (r0 == null || r0.A00() == null || !this.A0n || location.getAccuracy() >= 200.0f || this.A0g.A00().distanceTo(location) <= 1000.0f) {
                z = false;
            } else {
                this.A0n = false;
            }
            this.A06 = location;
            if (this.A0g != null && !z) {
                return;
            }
            if ((location.getAccuracy() < 200.0f && location.getTime() + 60000 > System.currentTimeMillis()) || this.A0r) {
                C117665sI.A00(this.A0z, this, location, 31, z);
            }
        }
    }

    public C108145cU(C111095hX r3, C55682qk r4, C159027ky r5, C69263Wi r6, C56972sr r7, C56492s4 r8, C621033m r9, AnonymousClass5UX r10, C56422rx r11, C48952fk r12, C613330g r13, AnonymousClass5U6 r14, C620633i r15, C56612sH r16, C54292oU r17, AnonymousClass5ZR r18, AnonymousClass33p r19, C620733j r20, C56982ss r21, AnonymousClass487 r22, AnonymousClass5IY r23, C27821ej r24, AnonymousClass5Y0 r25, EmojiSearchProvider emojiSearchProvider, AnonymousClass1VX r27, AnonymousClass33K r28, C621233o r29, C28071fd r30, AnonymousClass5OZ r31, WhatsAppLibLoader whatsAppLibLoader, C60152y5 r33, C55832qz r34, C66433Lk r35, C105895Wv r36, AnonymousClass4FS r37) {
        this.A1A = r17;
        this.A19 = r16;
        this.A1K = r27;
        this.A0z = r6;
        this.A1U = r36;
        this.A0x = r4;
        this.A10 = r7;
        this.A1V = r37;
        this.A1E = r21;
        this.A11 = r8;
        this.A1I = r25;
        this.A12 = r9;
        this.A1H = r24;
        this.A0w = r3;
        this.A1N = r30;
        this.A13 = r10;
        this.A18 = r15;
        this.A1D = r20;
        this.A1G = r23;
        this.A1T = r35;
        this.A1S = r34;
        this.A15 = r12;
        this.A1P = r31;
        this.A1Q = whatsAppLibLoader;
        this.A1J = emojiSearchProvider;
        this.A14 = r11;
        this.A1L = r28;
        this.A1B = r18;
        this.A1C = r19;
        this.A0y = r5;
        this.A1M = r29;
        this.A1R = r33;
        this.A16 = r13;
        this.A1F = r22;
        this.A17 = r14;
    }

    public void A0H(Intent intent) {
        if ("android.intent.action.SEARCH".equals(intent.getAction())) {
            A0J(A02(), intent.getStringExtra("query"), Math.max(A00(), 50000), true, true);
        }
    }

    public boolean A0V(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_search || itemId == R.id.menuitem_search) {
            this.A0X.onSearchRequested();
            return true;
        } else if (itemId == 1) {
            this.A0n = false;
            A0J(A02(), (String) null, A00(), false, true);
            return true;
        } else if (itemId != 16908332) {
            return false;
        } else {
            if (this.A0t) {
                this.A0a.A05.dismiss();
                A06();
                return true;
            }
            this.A0X.finish();
            return true;
        }
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
