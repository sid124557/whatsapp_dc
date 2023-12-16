package com.whatsapp.status.privacy;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0FH;
import X.AnonymousClass0O1;
import X.AnonymousClass0Y8;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass21S;
import X.AnonymousClass223;
import X.AnonymousClass2X0;
import X.AnonymousClass33p;
import X.AnonymousClass344;
import X.AnonymousClass4S6;
import X.AnonymousClass5PH;
import X.AnonymousClass5TZ;
import X.AnonymousClass5V0;
import X.AnonymousClass64B;
import X.AnonymousClass693;
import X.C003203q;
import X.C003403v;
import X.C02710Hh;
import X.C05880Vi;
import X.C104045Pk;
import X.C104745Se;
import X.C107595bZ;
import X.C108845de;
import X.C109495ei;
import X.C111135hb;
import X.C113995mK;
import X.C1226565f;
import X.C1235268t;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18300x5;
import X.C18320x8;
import X.C183538qC;
import X.C19340zH;
import X.C56042rK;
import X.C620233e;
import X.C620733j;
import X.C626936e;
import X.C86604Kt;
import X.C86644Kx;
import X.C989753y;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.bridge.wfal.WfalManager;
import java.lang.ref.WeakReference;

public final class StatusPrivacyBottomSheetDialogFragment extends Hilt_StatusPrivacyBottomSheetDialogFragment implements AnonymousClass64B {
    public static final AnonymousClass21S A0K = AnonymousClass21S.A0T;
    public WfalManager A00;
    public AnonymousClass33p A01;
    public C620733j A02;
    public C108845de A03;
    public C620233e A04;
    public AnonymousClass1VX A05;
    public AnonymousClass5TZ A06;
    public AnonymousClass2X0 A07;
    public C113995mK A08;
    public C104045Pk A09;
    public C1226565f A0A;
    public AnonymousClass4S6 A0B;
    public C56042rK A0C;
    public C104745Se A0D;
    public C183538qC A0E;
    public C183538qC A0F;
    public boolean A0G;
    public boolean A0H;
    public final AnonymousClass0O1 A0I = Bid(new C107595bZ(this, 7), new C003403v());
    public final AnonymousClass0O1 A0J = Bid(new C107595bZ(this, 8), new C003403v());

    public void A1G(Context context) {
        C162457s7.A0J(context, 0);
        super.A1G(context);
        if (context instanceof C1226565f) {
            this.A0A = (C1226565f) context;
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Activity must implement ");
        throw AnonymousClass000.A0I(C1226565f.class.getSimpleName(), A0o);
    }

    public final class DiscardChangesConfirmationDialogFragment extends Hilt_StatusPrivacyBottomSheetDialogFragment_DiscardChangesConfirmationDialogFragment {
        public boolean A00;
        public final C108845de A01;
        public final C56042rK A02;
        public final C111135hb A03;
        public final WeakReference A04;
        public final boolean A05;

        public DiscardChangesConfirmationDialogFragment(C108845de r2, C1226565f r3, C56042rK r4, C111135hb r5, boolean z) {
            C162457s7.A0J(r5, 3);
            this.A01 = r2;
            this.A03 = r5;
            this.A05 = z;
            this.A02 = r4;
            this.A04 = AnonymousClass0x9.A14(r3);
        }

        public void A0c() {
            super.A0c();
            if (this.A05 && !this.A00) {
                boolean z = this.A01.A03;
                C111135hb r2 = this.A03;
                Boolean A0V = C18320x8.A0V(z);
                r2.A06("initial_auto_setting", A0V);
                r2.A06("final_auto_setting", A0V);
                r2.A04("TAP_OUTSIDE_DIALOG");
            }
        }

        public Dialog A1J(Bundle bundle) {
            C003203q A0Q = A0Q();
            if (A0Q != null) {
                C19340zH A002 = AnonymousClass5V0.A00(A0Q);
                A002.A0T(R.string.f11nameremoved);
                C1235268t.A03(A002, this, 129, R.string.f11nameremoved);
                C1235268t.A04(A002, this, 130, R.string.f11nameremoved);
                return C18300x5.A0H(A002);
            }
            throw C18300x5.A0X();
        }
    }

    public void A1a() {
        C108845de r0 = this.A03;
        if (r0 == null) {
            throw C18270x1.A0S("statusDistributionInfo");
        }
        if (r0.A00 != 1) {
            this.A0H = true;
        }
        AnonymousClass33p r02 = this.A01;
        if (r02 != null) {
            if (C18280x3.A1W(AnonymousClass0x2.A0F(r02), "audience_selection_2")) {
                A1b(1);
            }
            A1c(false);
            return;
        }
        throw C18270x1.A0S("sharedPreferences");
    }

    public void A1b(int i) {
        C108845de r1 = this.A03;
        if (r1 == null) {
            throw C18270x1.A0S("statusDistributionInfo");
        }
        int i2 = i;
        if (i != r1.A00) {
            this.A0H = true;
        }
        this.A03 = new C108845de(r1.A01, r1.A02, i2, r1.A03, r1.A04);
    }

    public final void A1c(boolean z) {
        Intent intent;
        AnonymousClass5TZ r1;
        C108845de r0;
        AnonymousClass33p r02 = this.A01;
        if (r02 != null) {
            boolean A1W = C18280x3.A1W(AnonymousClass0x2.A0F(r02), "audience_selection_2");
            Context A0G2 = A0G();
            if (A1W) {
                AnonymousClass5PH r12 = new AnonymousClass5PH(A0G2);
                r12.A0Q = Integer.valueOf(C18280x3.A00(z ? 1 : 0));
                r12.A0O = 2000;
                intent = r12.A03("com.whatsapp.contact.picker.AudienceSelectionContactPicker");
                r1 = this.A06;
                if (r1 != null) {
                    r0 = this.A03;
                    if (r0 == null) {
                        throw C18270x1.A0S("statusDistributionInfo");
                    }
                } else {
                    throw C18270x1.A0S("statusAudienceRepository");
                }
            } else {
                intent = C18320x8.A07();
                intent.setClassName(A0G2.getPackageName(), "com.whatsapp.status.audienceselector.StatusTemporalRecipientsActivity");
                intent.putExtra("is_black_list", z);
                r1 = this.A06;
                if (r1 != null) {
                    r0 = this.A03;
                    if (r0 == null) {
                        throw C18270x1.A0S("statusDistributionInfo");
                    }
                } else {
                    throw C18270x1.A0S("statusAudienceRepository");
                }
            }
            r1.A01(intent, r0);
            this.A0I.A00((C05880Vi) null, intent);
            return;
        }
        throw C18270x1.A0S("sharedPreferences");
    }

    public void onCancel(DialogInterface dialogInterface) {
        C1226565f r3;
        if (this.A0A != null && this.A0H) {
            if (this.A0G) {
                C183538qC r0 = this.A0F;
                if (r0 != null) {
                    C86644Kx.A0c(r0).A03(927605897, (String) null, "TAP_AUDIENCE_SELECTOR_TOGGLE");
                    C183538qC r02 = this.A0F;
                    if (r02 != null) {
                        C86644Kx.A0c(r02).A05("SEE_CHANGES_DIALOG");
                    } else {
                        throw C18270x1.A0S("xFamilyUserFlowLoggerLazy");
                    }
                } else {
                    throw C18270x1.A0S("xFamilyUserFlowLoggerLazy");
                }
            }
            if (A0Q() != null && (r3 = this.A0A) != null) {
                C108845de r2 = this.A03;
                if (r2 == null) {
                    throw C18270x1.A0S("statusDistributionInfo");
                }
                C183538qC r03 = this.A0F;
                if (r03 != null) {
                    C111135hb r5 = (C111135hb) C18300x5.A0b(r03);
                    boolean z = this.A0G;
                    C56042rK r4 = this.A0C;
                    if (r4 != null) {
                        DiscardChangesConfirmationDialogFragment discardChangesConfirmationDialogFragment = new DiscardChangesConfirmationDialogFragment(r2, r3, r4, r5, z);
                        C003203q A0Q = A0Q();
                        if (A0Q != null) {
                            AnonymousClass344.A00(discardChangesConfirmationDialogFragment, A0Q.getSupportFragmentManager());
                            return;
                        }
                        return;
                    }
                    throw C18270x1.A0S("fbAccountManager");
                }
                throw C18270x1.A0S("xFamilyUserFlowLoggerLazy");
            }
        }
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass4S6 r0;
        ViewStub viewStub;
        View inflate;
        AnonymousClass4S6 r02;
        ViewStub viewStub2;
        View inflate2;
        int i;
        Bundle A0H2 = A0H();
        C626936e.A06(A0H2);
        AnonymousClass5TZ r03 = this.A06;
        if (r03 != null) {
            C162457s7.A0H(A0H2);
            C108845de A002 = r03.A00(A0H2);
            C626936e.A06(A002);
            C162457s7.A0D(A002);
            this.A03 = A002;
            boolean z = A0H().getBoolean("should_display_xo");
            AnonymousClass4S6 r2 = new AnonymousClass4S6(A0G());
            C620733j r1 = this.A02;
            if (r1 != null) {
                this.A09 = new C104045Pk(r1, r2);
                this.A0B = r2;
                if (z) {
                    WfalManager wfalManager = this.A00;
                    if (wfalManager == null) {
                        throw C18270x1.A0S("wfalManager");
                    } else if (wfalManager.A02()) {
                        AnonymousClass223 r12 = AnonymousClass223.FACEBOOK;
                        WfalManager wfalManager2 = this.A00;
                        if (wfalManager2 != null) {
                            boolean A1W = AnonymousClass000.A1W(wfalManager2.A01(r12));
                            AnonymousClass223 r13 = AnonymousClass223.INSTAGRAM;
                            WfalManager wfalManager3 = this.A00;
                            if (wfalManager3 != null) {
                                boolean A1W2 = AnonymousClass000.A1W(wfalManager3.A01(r13));
                                if (!((!A1W && !A1W2) || (r02 = this.A0B) == null || (viewStub2 = r02.A01) == null || (inflate2 = viewStub2.inflate()) == null)) {
                                    View A0E2 = C18280x3.A0E(inflate2, R.id.status_privacy_crossposting_fb_setting);
                                    View A0E3 = C18280x3.A0E(inflate2, R.id.status_privacy_crossposting_ig_setting);
                                    CompoundButton compoundButton = (CompoundButton) C18280x3.A0E(inflate2, R.id.auto_crosspost_setting_fb_checkbox);
                                    CompoundButton compoundButton2 = (CompoundButton) C18280x3.A0E(inflate2, R.id.auto_crosspost_setting_ig_checkbox);
                                    ImageView A0J2 = C86604Kt.A0J(inflate2, R.id.fb_icon);
                                    ImageView A0J3 = C86604Kt.A0J(inflate2, R.id.ig_icon);
                                    if (A1W) {
                                        A0E2.setVisibility(0);
                                        C108845de r04 = this.A03;
                                        if (r04 == null) {
                                            throw C18270x1.A0S("statusDistributionInfo");
                                        }
                                        compoundButton.setChecked(r04.A03);
                                        AnonymousClass693.A00(compoundButton, this, 8);
                                        A0J2.setColorFilter(C02710Hh.A00(AnonymousClass0FH.SRC_ATOP, AnonymousClass0Y8.A04(inflate2.getContext(), R.color.f5nameremoved)));
                                    }
                                    if (A1W2) {
                                        A0E3.setVisibility(0);
                                        C108845de r05 = this.A03;
                                        if (r05 == null) {
                                            throw C18270x1.A0S("statusDistributionInfo");
                                        }
                                        compoundButton2.setChecked(r05.A04);
                                        AnonymousClass693.A00(compoundButton2, this, 9);
                                        A0J3.setColorFilter(C02710Hh.A00(AnonymousClass0FH.SRC_ATOP, AnonymousClass0Y8.A04(inflate2.getContext(), R.color.f5nameremoved)));
                                    }
                                    TextView A0I2 = AnonymousClass0x2.A0I(inflate2, R.id.status_share_info_text);
                                    A0I2.setVisibility(0);
                                    if (A1W) {
                                        i = R.string.f11nameremoved;
                                        if (A1W2) {
                                            i = R.string.f11nameremoved;
                                        }
                                    } else {
                                        i = R.string.f11nameremoved;
                                    }
                                    A0I2.setText(i);
                                }
                            } else {
                                throw C18270x1.A0S("wfalManager");
                            }
                        } else {
                            throw C18270x1.A0S("wfalManager");
                        }
                    } else {
                        C104745Se r06 = this.A0D;
                        if (r06 == null) {
                            throw C18270x1.A0S("xFamilyGating");
                        } else if (r06.A00()) {
                            C56042rK r14 = this.A0C;
                            if (r14 == null) {
                                throw C18270x1.A0S("fbAccountManager");
                            } else if (!(!r14.A05(A0K) || (r0 = this.A0B) == null || (viewStub = r0.A00) == null || (inflate = viewStub.inflate()) == null)) {
                                CompoundButton compoundButton3 = (CompoundButton) C18280x3.A0E(inflate, R.id.auto_crosspost_setting_switch);
                                C108845de r07 = this.A03;
                                if (r07 == null) {
                                    throw C18270x1.A0S("statusDistributionInfo");
                                }
                                compoundButton3.setChecked(r07.A03);
                                AnonymousClass693.A00(compoundButton3, this, 10);
                            }
                        }
                    }
                }
                C104045Pk r4 = this.A09;
                if (r4 == null) {
                    throw C18270x1.A0S("statusPrivacyBottomSheetController");
                }
                C108845de r08 = this.A03;
                if (r08 == null) {
                    throw C18270x1.A0S("statusDistributionInfo");
                }
                int i2 = r08.A00;
                int size = r08.A01.size();
                C108845de r09 = this.A03;
                if (r09 == null) {
                    throw C18270x1.A0S("statusDistributionInfo");
                }
                int size2 = r09.A02.size();
                r4.A00(i2);
                r4.A01(size, size2);
                AnonymousClass4S6 r22 = r4.A01;
                C109495ei.A00(r22.A04, r22, this, 2);
                C109495ei.A00(r22.A03, r22, this, 3);
                C109495ei.A00(r22.A02, r22, this, 4);
                C989753y.A00(r22.A08, this, 28);
                C989753y.A00(r22.A05, this, 29);
                C989753y.A00(r22.A06, this, 30);
                return this.A0B;
            }
            throw C18270x1.A0S("whatsAppLocale");
        }
        throw C18270x1.A0S("statusAudienceRepository");
    }

    public void A0d() {
        super.A0d();
        this.A0A = null;
    }
}
