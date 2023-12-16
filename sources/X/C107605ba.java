package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.businessdirectory.util.DirectoryMapViewLocationUpdateListener;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: X.5ba  reason: invalid class name and case insensitive filesystem */
public class C107605ba implements C180298ko {
    public Object A00;
    public Object A01;
    public final int A02;

    public C107605ba(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0097, code lost:
        if (r1.isProviderEnabled("gps") == false) goto L_0x0099;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C110885hC r5, X.C107605ba r6) {
        /*
            java.lang.Object r2 = r6.A00
            X.4wv r2 = (X.C96784wv) r2
            java.lang.Object r4 = r6.A01
            X.4wH r4 = (X.C96384wH) r4
            r5.A06()
            X.5ZO r0 = r4.A01
            r2.A00 = r0
            X.5UT r0 = r2.A02
            if (r0 != 0) goto L_0x001d
            X.7Tr r3 = r2.A08
            r1 = 0
            X.5UT r0 = new X.5UT
            r0.<init>(r5, r1, r3)
            r2.A02 = r0
        L_0x001d:
            X.5dr r0 = r4.A00
            float r0 = r0.A01
            X.7yk r0 = r2.A0A(r0)
            X.7UM r0 = X.C153847c7.A00(r0)
            r5.A0A(r0)
            X.5UT r0 = r2.A02
            if (r0 == 0) goto L_0x0033
            r0.A01()
        L_0x0033:
            X.5UT r3 = r2.A02
            if (r3 == 0) goto L_0x003e
            X.5ZO r1 = r2.A00
            java.util.List r0 = r4.A02
            r3.A04(r1, r0)
        L_0x003e:
            X.5UT r1 = r2.A02
            if (r1 == 0) goto L_0x0047
            java.util.List r0 = r4.A02
            r1.A06(r0)
        L_0x0047:
            X.5UT r1 = r2.A02
            if (r1 == 0) goto L_0x0066
            X.4GS r4 = r4.A04
            int r0 = r1.A01
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            int r0 = r1.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.7yk r0 = r5.A02()
            float r0 = r0.A02
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r4.BGj(r3, r1, r0)
        L_0x0066:
            android.view.View r0 = r2.A06
            android.app.Activity r1 = X.C111095hX.A04(r0)
            java.lang.String r0 = "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"
            X.C162457s7.A0K(r1, r0)
            java.lang.String r0 = "location"
            java.lang.Object r1 = r1.getSystemService(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.location.LocationManager"
            X.C162457s7.A0K(r1, r0)
            android.location.LocationManager r1 = (android.location.LocationManager) r1
            X.5Tn r0 = r2.A07
            boolean r0 = r0.A04()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0099
            X.5ZR r0 = r2.A04
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x0099
            java.lang.String r0 = "gps"
            boolean r1 = r1.isProviderEnabled(r0)
            r0 = 1
            if (r1 != 0) goto L_0x009a
        L_0x0099:
            r0 = 0
        L_0x009a:
            r5.A0E(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107605ba.A00(X.5hC, X.5ba):void");
    }

    public final void BW1(C110885hC r16) {
        AnonymousClass5MM r0;
        C110885hC r6 = r16;
        switch (this.A02) {
            case 0:
                BusinessDirectoryMapViewActivity businessDirectoryMapViewActivity = (BusinessDirectoryMapViewActivity) this.A00;
                Bundle bundle = (Bundle) this.A01;
                businessDirectoryMapViewActivity.A07 = r6;
                if (r16 != null) {
                    r6.A0E(businessDirectoryMapViewActivity.A79());
                    AnonymousClass7TJ r1 = r6.A0T;
                    if (r1 != null) {
                        r1.A01 = false;
                        r1.A00();
                    }
                }
                businessDirectoryMapViewActivity.A04 = (ViewGroup) C18280x3.A0E(businessDirectoryMapViewActivity.A00, R.id.progress_bar_container);
                TextEmojiLabel A0M = C86614Ku.A0M(businessDirectoryMapViewActivity.A00, R.id.chip_text_view);
                businessDirectoryMapViewActivity.A0B = A0M;
                if (A0M == null) {
                    throw C18270x1.A0S("mapViewChipText");
                }
                C18290x4.A1H(A0M, businessDirectoryMapViewActivity, 29);
                BottomSheetBehavior A012 = BottomSheetBehavior.A01(businessDirectoryMapViewActivity.findViewById(R.id.bottom_sheet_holder));
                C162457s7.A0D(A012);
                businessDirectoryMapViewActivity.A09 = A012;
                businessDirectoryMapViewActivity.A02 = C18280x3.A0E(businessDirectoryMapViewActivity.A00, R.id.bottom_sheet_holder);
                C18290x4.A1H(C06560Yg.A02(businessDirectoryMapViewActivity.A00, R.id.dismiss_btn), businessDirectoryMapViewActivity, 28);
                View view = businessDirectoryMapViewActivity.A02;
                if (view == null) {
                    throw C18270x1.A0S("businessProfileSheet");
                }
                View A0E = C18280x3.A0E(view, R.id.business_profile_row);
                C86624Kv.A0r(A0E);
                AnonymousClass5UV r02 = businessDirectoryMapViewActivity.A0H;
                if (r02 != null) {
                    r02.A05(A0E);
                    View view2 = businessDirectoryMapViewActivity.A02;
                    if (view2 == null) {
                        throw C18270x1.A0S("businessProfileSheet");
                    }
                    C18280x3.A0E(view2, R.id.business_avatar).setVisibility(8);
                    BottomSheetBehavior bottomSheetBehavior = businessDirectoryMapViewActivity.A09;
                    if (bottomSheetBehavior == null) {
                        throw C18270x1.A0S("bottomSheetBehavior");
                    }
                    C1232167o.A00(bottomSheetBehavior, businessDirectoryMapViewActivity, 1);
                    C18290x4.A1H(C06560Yg.A02(businessDirectoryMapViewActivity.A00, R.id.back_button), businessDirectoryMapViewActivity, 26);
                    C18290x4.A1H(C06560Yg.A02(businessDirectoryMapViewActivity.A00, R.id.my_location), businessDirectoryMapViewActivity, 27);
                    AnonymousClass5EF r12 = businessDirectoryMapViewActivity.A0A;
                    if (r12 != null) {
                        AnonymousClass4U2 r03 = (AnonymousClass4U2) AnonymousClass4L0.A0F(new C87504Te(bundle, businessDirectoryMapViewActivity, r12), businessDirectoryMapViewActivity).A01(AnonymousClass4U2.class);
                        businessDirectoryMapViewActivity.A0N = r03;
                        if (r03 == null) {
                            throw C18270x1.A0S("viewModel");
                        }
                        C86604Kt.A1N(businessDirectoryMapViewActivity, r03.A0i, new C121295zz(businessDirectoryMapViewActivity), 73);
                        AnonymousClass4U2 r04 = businessDirectoryMapViewActivity.A0N;
                        if (r04 == null) {
                            throw C18270x1.A0S("viewModel");
                        }
                        C86604Kt.A1N(businessDirectoryMapViewActivity, r04.A0N, new AnonymousClass600(businessDirectoryMapViewActivity), 74);
                        AnonymousClass4U2 r05 = businessDirectoryMapViewActivity.A0N;
                        if (r05 == null) {
                            throw C18270x1.A0S("viewModel");
                        }
                        C86604Kt.A1N(businessDirectoryMapViewActivity, r05.A0g, new AnonymousClass601(businessDirectoryMapViewActivity), 75);
                        AnonymousClass4U2 r06 = businessDirectoryMapViewActivity.A0N;
                        if (r06 == null) {
                            throw C18270x1.A0S("viewModel");
                        }
                        C86604Kt.A1N(businessDirectoryMapViewActivity, r06.A0P, new AnonymousClass602(businessDirectoryMapViewActivity), 76);
                        AnonymousClass4U2 r07 = businessDirectoryMapViewActivity.A0N;
                        if (r07 == null) {
                            throw C18270x1.A0S("viewModel");
                        }
                        C86604Kt.A1N(businessDirectoryMapViewActivity, r07.A0h, new C175288Xu(businessDirectoryMapViewActivity), 77);
                        AnonymousClass4U2 r08 = businessDirectoryMapViewActivity.A0N;
                        if (r08 == null) {
                            throw C18270x1.A0S("viewModel");
                        }
                        C86604Kt.A1N(businessDirectoryMapViewActivity, r08.A0Q, new AnonymousClass603(businessDirectoryMapViewActivity), 78);
                        AnonymousClass4U2 r09 = businessDirectoryMapViewActivity.A0N;
                        if (r09 == null) {
                            throw C18270x1.A0S("viewModel");
                        }
                        C86604Kt.A1N(businessDirectoryMapViewActivity, r09.A0f, new AnonymousClass604(businessDirectoryMapViewActivity), 79);
                        AnonymousClass4U2 r010 = businessDirectoryMapViewActivity.A0N;
                        if (r010 == null) {
                            throw C18270x1.A0S("viewModel");
                        }
                        C86604Kt.A1N(businessDirectoryMapViewActivity, r010.A0O, new C175298Xv(businessDirectoryMapViewActivity), 80);
                        AnonymousClass08A r13 = businessDirectoryMapViewActivity.A06;
                        DirectoryMapViewLocationUpdateListener directoryMapViewLocationUpdateListener = businessDirectoryMapViewActivity.A0F;
                        if (directoryMapViewLocationUpdateListener != null) {
                            r13.A00(directoryMapViewLocationUpdateListener);
                            DirectoryMapViewLocationUpdateListener directoryMapViewLocationUpdateListener2 = businessDirectoryMapViewActivity.A0F;
                            if (directoryMapViewLocationUpdateListener2 != null) {
                                C86604Kt.A1N(businessDirectoryMapViewActivity, directoryMapViewLocationUpdateListener2.A00, new C121285zy(businessDirectoryMapViewActivity), 72);
                                C110885hC r2 = businessDirectoryMapViewActivity.A07;
                                if (r2 != null) {
                                    r2.A09 = new AnonymousClass825(r2, businessDirectoryMapViewActivity);
                                    r2.A0L = new AnonymousClass7H8(r2, businessDirectoryMapViewActivity);
                                    if (r2.A0R.A0V) {
                                        r2.A05();
                                    }
                                    r2.A0B = new C1892990t(businessDirectoryMapViewActivity, 0);
                                    r2.A0C = new AnonymousClass69V(businessDirectoryMapViewActivity, 0);
                                }
                                businessDirectoryMapViewActivity.A75();
                                return;
                            }
                            throw C18270x1.A0S("locationUpdateListener");
                        }
                        throw C18270x1.A0S("locationUpdateListener");
                    }
                    throw C18270x1.A0S("viewModelFactory");
                }
                throw C18270x1.A0S("businessProfileRowHelper");
            case 1:
                BusinessDirectorySERPMapViewActivity businessDirectorySERPMapViewActivity = (BusinessDirectorySERPMapViewActivity) this.A00;
                Bundle bundle2 = (Bundle) this.A01;
                businessDirectorySERPMapViewActivity.A03 = r6;
                if (r16 != null) {
                    r6.A0E(businessDirectorySERPMapViewActivity.A78());
                    AnonymousClass7TJ r14 = r6.A0T;
                    if (r14 != null) {
                        r14.A01 = false;
                        r14.A00();
                    }
                }
                C162457s7.A0H(r6);
                C151167Tr r22 = businessDirectorySERPMapViewActivity.A08;
                if (r22 != null) {
                    businessDirectorySERPMapViewActivity.A09 = new AnonymousClass5UT(r6, new AnonymousClass5MM(businessDirectorySERPMapViewActivity), r22);
                    Bundle bundleExtra = businessDirectorySERPMapViewActivity.getIntent().getBundleExtra("arg_search_filters");
                    C626936e.A06(bundleExtra);
                    Parcelable parcelableExtra = businessDirectorySERPMapViewActivity.getIntent().getParcelableExtra("arg_map_view_config");
                    C626936e.A06(parcelableExtra);
                    C108965dr r9 = (C108965dr) parcelableExtra;
                    AnonymousClass5ZO A022 = AnonymousClass5ZO.A02(C86664Kz.A1J(businessDirectorySERPMapViewActivity.getIntent(), "arg_search_location"));
                    String stringExtra = businessDirectorySERPMapViewActivity.getIntent().getStringExtra("arg_csvm_config");
                    ArrayList parcelableArrayListExtra = businessDirectorySERPMapViewActivity.getIntent().getParcelableArrayListExtra("arg_map_business_marker_data");
                    C626936e.A06(parcelableArrayListExtra);
                    C162457s7.A0D(parcelableArrayListExtra);
                    C162457s7.A0H(bundleExtra);
                    C162457s7.A0H(r9);
                    C626936e.A06(A022);
                    C162457s7.A0D(A022);
                    Parcelable parcelableExtra2 = businessDirectorySERPMapViewActivity.getIntent().getParcelableExtra("arg_parent_category");
                    C626936e.A06(parcelableExtra2);
                    C162457s7.A0D(parcelableExtra2);
                    C166447yh r122 = (C166447yh) parcelableExtra2;
                    AnonymousClass5UT r11 = businessDirectorySERPMapViewActivity.A09;
                    if (r11 == null) {
                        throw C18270x1.A0S("businessMarkerManager");
                    }
                    C101345Ek r8 = businessDirectorySERPMapViewActivity.A04;
                    if (r8 != null) {
                        AnonymousClass4U8 r15 = (AnonymousClass4U8) AnonymousClass4L0.A0F(new C87564Tk(bundle2, bundleExtra, businessDirectorySERPMapViewActivity, r8, r9, A022, r11, r122, stringExtra, parcelableArrayListExtra), businessDirectorySERPMapViewActivity).A01(AnonymousClass4U8.class);
                        C162457s7.A0J(r15, 0);
                        businessDirectorySERPMapViewActivity.A06 = r15;
                        C86604Kt.A1N(businessDirectorySERPMapViewActivity, businessDirectorySERPMapViewActivity.A74().A0H, new AnonymousClass605(businessDirectorySERPMapViewActivity), 87);
                        C86604Kt.A1N(businessDirectorySERPMapViewActivity, businessDirectorySERPMapViewActivity.A74().A0G, new AnonymousClass606(businessDirectorySERPMapViewActivity), 88);
                        C86604Kt.A1N(businessDirectorySERPMapViewActivity, businessDirectorySERPMapViewActivity.A74().A0a, new AnonymousClass607(businessDirectorySERPMapViewActivity), 81);
                        C86604Kt.A1N(businessDirectorySERPMapViewActivity, businessDirectorySERPMapViewActivity.A74().A0F, AnonymousClass8Z5.A00, 82);
                        C86604Kt.A1N(businessDirectorySERPMapViewActivity, businessDirectorySERPMapViewActivity.A74().A0b, new AnonymousClass608(businessDirectorySERPMapViewActivity), 83);
                        C86604Kt.A1N(businessDirectorySERPMapViewActivity, businessDirectorySERPMapViewActivity.A74().A0Z, new C175308Xw(businessDirectorySERPMapViewActivity), 84);
                        AnonymousClass5UT r011 = businessDirectorySERPMapViewActivity.A09;
                        if (r011 == null) {
                            throw C18270x1.A0S("businessMarkerManager");
                        }
                        C86604Kt.A1N(businessDirectorySERPMapViewActivity, r011.A07, new AnonymousClass609(businessDirectorySERPMapViewActivity), 85);
                        C86604Kt.A1N(businessDirectorySERPMapViewActivity, businessDirectorySERPMapViewActivity.A74().A0Y, new C175318Xx(businessDirectorySERPMapViewActivity), 86);
                        AnonymousClass4U8 A74 = businessDirectorySERPMapViewActivity.A74();
                        if (bundle2 == null) {
                            C105355Up r17 = A74.A0X;
                            if (r17.A04() && r17.A03.A0X(4488)) {
                                List A0q = C86654Ky.A0q(A74.A0A, 30);
                                if (C18310x6.A1X(A0q)) {
                                    C109075e2 r3 = (C109075e2) C73723fy.A03(A0q);
                                    AnonymousClass5UT r23 = A74.A08;
                                    C162457s7.A0J(r3, 0);
                                    AnonymousClass4Zh r18 = (AnonymousClass4Zh) r23.A0B.A05.get(r3);
                                    if (!(r18 == null || (r0 = r23.A09) == null)) {
                                        r0.A00(r3, r18);
                                    }
                                }
                            }
                        } else {
                            AnonymousClass5UT r24 = businessDirectorySERPMapViewActivity.A09;
                            if (r24 == null) {
                                throw C18270x1.A0S("businessMarkerManager");
                            }
                            C109075e2 r19 = A74.A07;
                            if (r19 != null) {
                                r19.A09 = false;
                            }
                            A74.A08 = r24;
                            A74.A02 = r24.A07;
                            r24.A01();
                            r24.A04(A74.A05, A74.A0A);
                            C109075e2 r110 = A74.A07;
                            if (r110 != null) {
                                r110.A09 = true;
                                r24.A05(r110, (Integer) null);
                                r24.A02();
                            }
                        }
                        AnonymousClass08A r111 = businessDirectorySERPMapViewActivity.A06;
                        DirectoryMapViewLocationUpdateListener directoryMapViewLocationUpdateListener3 = businessDirectorySERPMapViewActivity.A04;
                        if (directoryMapViewLocationUpdateListener3 != null) {
                            r111.A00(directoryMapViewLocationUpdateListener3);
                            DirectoryMapViewLocationUpdateListener directoryMapViewLocationUpdateListener4 = businessDirectorySERPMapViewActivity.A04;
                            if (directoryMapViewLocationUpdateListener4 != null) {
                                C86604Kt.A1N(businessDirectorySERPMapViewActivity, directoryMapViewLocationUpdateListener4.A00, new AnonymousClass60A(businessDirectorySERPMapViewActivity), 89);
                                C110885hC r25 = businessDirectorySERPMapViewActivity.A03;
                                if (r25 != null) {
                                    r25.A0W.add(new C110845h8(businessDirectorySERPMapViewActivity));
                                    r25.A0B = new C1892990t(businessDirectorySERPMapViewActivity, 1);
                                }
                                C110885hC r012 = businessDirectorySERPMapViewActivity.A03;
                                if (r012 != null) {
                                    r012.A0R.A0T = new C110895hD(businessDirectorySERPMapViewActivity);
                                    return;
                                }
                                return;
                            }
                            throw C18270x1.A0S("locationUpdateListener");
                        }
                        throw C18270x1.A0S("locationUpdateListener");
                    }
                    throw C18270x1.A0S("viewModelFactory");
                }
                throw C18270x1.A0S("directoryImageLoader");
            case 2:
                A00(r6, this);
                return;
            case 3:
                C95874ug r5 = (C95874ug) this.A00;
                Context context = (Context) this.A01;
                AnonymousClass4Zd r32 = r5.A07;
                if (r32 == null) {
                    C142776xk r26 = r5.A08;
                    C156807hE r112 = r5.A09;
                    if (r112 == null) {
                        r112 = new AnonymousClass6KT(context, r5);
                        r5.A09 = r112;
                    }
                    Drawable A013 = AnonymousClass0VX.A01(context, R.drawable.ic_provider_info);
                    Objects.requireNonNull(A013);
                    r32 = new AnonymousClass4Zd(A013, r6, r26, r112);
                    r5.A07 = r32;
                }
                r6.A0C(r32);
                r32.A09(true);
                return;
            default:
                int dimensionPixelSize = ((View) this.A00).getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
                r6.A08(dimensionPixelSize * 2, dimensionPixelSize, dimensionPixelSize);
                C150797Sg r113 = new C150797Sg();
                r113.A02 = C108975ds.A02((LatLng) this.A01);
                r113.A01 = 15.0f;
                r6.A0A(C153847c7.A00(r113.A00()));
                return;
        }
    }
}
