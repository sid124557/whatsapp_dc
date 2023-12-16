package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity;
import com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.9DA  reason: invalid class name */
public abstract class AnonymousClass9DA extends AnonymousClass9DB {
    public int A00;
    public int A01;
    public int A02 = 0;
    public int A03;
    public AnonymousClass5WY A04;
    public C56492s4 A05;
    public AnonymousClass5ZU A06;
    public AnonymousClass36F A07;
    public AnonymousClass3ZH A08;
    public AnonymousClass39Q A09;
    public C133686hm A0A;
    public C166587yw A0B;
    public AnonymousClass4FV A0C;
    public AnonymousClass33K A0D;
    public UserJid A0E;
    public C166557yt A0F;
    public C166557yt A0G;
    public C166557yt A0H;
    public C166557yt A0I;
    public AnonymousClass9VH A0J;
    public AnonymousClass99H A0K;
    public AnonymousClass9U1 A0L;
    public C196629bS A0M;
    public AnonymousClass9W6 A0N;
    public AnonymousClass99L A0O = new AnonymousClass99L();
    public C620933l A0P;
    public C29271iY A0Q;
    public AnonymousClass99N A0R;
    public C197109ca A0S;
    public AnonymousClass9H2 A0T;
    public C166207yJ A0U = null;
    public AnonymousClass9B3 A0V;
    public C195219Wq A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public String A0b;
    public String A0c;
    public String A0d;
    public String A0e;
    public String A0f;
    public String A0g;
    public String A0h;
    public List A0i;
    public AnonymousClass4C1 A0j;
    public boolean A0k;
    public boolean A0l = true;
    public boolean A0m = false;
    public boolean A0n = false;
    public boolean A0o = true;
    public final C160757oG A0p = C160757oG.A00("IndiaUpiBasePaymentsActivity", "payment", "IN");
    public final AtomicInteger A0q = new AtomicInteger();

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0041, code lost:
        if (r3.A0l != false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r0 != false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A7J() {
        /*
            r3 = this;
            r0 = 1
            r3.A0m = r0
            X.0zH r2 = X.AnonymousClass5V0.A00(r3)
            r0 = 2131891902(0x7f1216be, float:1.9418537E38)
            r2.A0U(r0)
            boolean r0 = r3 instanceof com.whatsapp.payments.ui.IndiaUpiBankPickerActivityOld
            if (r0 != 0) goto L_0x003e
            boolean r0 = r3 instanceof com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity
            if (r0 != 0) goto L_0x003e
            boolean r0 = r3.A0l
            r1 = 2131891899(0x7f1216bb, float:1.9418531E38)
            if (r0 == 0) goto L_0x001f
        L_0x001c:
            r1 = 2131891905(0x7f1216c1, float:1.9418543E38)
        L_0x001f:
            java.lang.String r0 = r3.getString(r1)
        L_0x0023:
            r2.A0g(r0)
            r1 = 2131891901(0x7f1216bd, float:1.9418535E38)
            r0 = 20
            X.C204219p0.A01(r2, r3, r0, r1)
            r1 = 2131891900(0x7f1216bc, float:1.9418533E38)
            r0 = 21
            X.C204219p0.A00(r2, r3, r0, r1)
            r0 = 0
            r2.A0i(r0)
            r2.A0S()
            return
        L_0x003e:
            boolean r1 = r3.A0l
            r0 = 0
            if (r1 == 0) goto L_0x0023
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9DA.A7J():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.whatsapp.payments.ui.IndiaUpiBankPickerActivityOld} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: X.9D8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A7H() {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.AnonymousClass9D8
            if (r0 == 0) goto L_0x002a
            r3 = r4
            X.9D8 r3 = (X.AnonymousClass9D8) r3
            X.9U1 r0 = r3.A0L
            X.7bd r0 = r0.A04
            java.util.concurrent.CopyOnWriteArrayList r1 = r0.A07
            java.lang.String r0 = "done"
            r1.add(r0)
            X.7oG r2 = r3.A0J
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "clearStates: "
            r1.append(r0)
            X.9U1 r0 = r3.A0L
            X.7bd r0 = r0.A04
            X.C1899593h.A1I(r2, r0, r1)
        L_0x0024:
            X.9U1 r0 = r3.A0L
        L_0x0026:
            r0.A0A()
        L_0x0029:
            return
        L_0x002a:
            boolean r0 = r4 instanceof com.whatsapp.payments.ui.IndiaUpiOnboardingErrorEducationActivity
            if (r0 == 0) goto L_0x0031
            X.9U1 r0 = r4.A0L
            goto L_0x0026
        L_0x0031:
            boolean r0 = r4 instanceof com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity
            if (r0 == 0) goto L_0x0054
            r3 = r4
            com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity r3 = (com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity) r3
            X.7bd r0 = r3.A0E
            if (r0 == 0) goto L_0x0024
            java.util.concurrent.CopyOnWriteArrayList r1 = r0.A07
            java.lang.String r0 = "done"
            r1.add(r0)
            X.7oG r2 = r3.A0h
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "clearStates: "
            r1.append(r0)
            X.7bd r0 = r3.A0E
            X.C1899593h.A1I(r2, r0, r1)
            goto L_0x0024
        L_0x0054:
            boolean r0 = r4 instanceof com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity
            if (r0 == 0) goto L_0x0079
            r3 = r4
            com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity r3 = (com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity) r3
            X.7bd r0 = r3.A0G
            java.util.concurrent.CopyOnWriteArrayList r1 = r0.A07
            java.lang.String r0 = "done"
            r1.add(r0)
            X.7oG r2 = r3.A0Z
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "clearStates: "
            r1.append(r0)
            X.7bd r0 = r3.A0G
            java.lang.String r0 = r0.toString()
            X.C1899593h.A1J(r2, r0, r1)
            goto L_0x0024
        L_0x0079:
            boolean r0 = r4 instanceof com.whatsapp.payments.ui.IndiaUpiBankPickerActivityOld
            if (r0 == 0) goto L_0x00a0
            r3 = r4
            com.whatsapp.payments.ui.IndiaUpiBankPickerActivityOld r3 = (com.whatsapp.payments.ui.IndiaUpiBankPickerActivityOld) r3
            X.7bd r0 = r3.A06
            if (r0 == 0) goto L_0x0024
            java.util.concurrent.CopyOnWriteArrayList r1 = r0.A07
            java.lang.String r0 = "done"
            r1.add(r0)
            X.7oG r2 = r3.A0J
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "clearStates: "
            r1.append(r0)
            X.7bd r0 = r3.A06
            java.lang.String r0 = r0.toString()
            X.C1899593h.A1J(r2, r0, r1)
            goto L_0x0024
        L_0x00a0:
            boolean r0 = r4 instanceof com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity
            if (r0 == 0) goto L_0x0029
            r3 = r4
            com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity r3 = (com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity) r3
            X.7bd r0 = r3.A05
            if (r0 == 0) goto L_0x0024
            java.util.concurrent.CopyOnWriteArrayList r1 = r0.A07
            java.lang.String r0 = "done"
            r1.add(r0)
            X.7oG r2 = r3.A0G
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "clearStates: "
            r1.append(r0)
            X.7bd r0 = r3.A05
            java.lang.String r0 = r0.toString()
            X.C1899593h.A1J(r2, r0, r1)
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9DA.A7H():void");
    }

    public void A7I() {
        if (this instanceof IndiaUpiBankAccountPickerActivity) {
            IndiaUpiBankAccountPickerActivity indiaUpiBankAccountPickerActivity = (IndiaUpiBankAccountPickerActivity) this;
            indiaUpiBankAccountPickerActivity.A0X = false;
            AnonymousClass0R6 r0 = indiaUpiBankAccountPickerActivity.A0B.A0N;
            if (r0 != null) {
                r0.A05();
                return;
            }
            return;
        }
        C86604Kt.A1A(findViewById(R.id.progress));
    }

    public void A7M(int i, String str) {
        String str2 = str;
        this.A0S.A0A(AnonymousClass001.A0f(), Integer.valueOf(i), str2, this.A0f, this.A0i, this.A0h, AnonymousClass9DC.A17(this));
    }

    public void A7O(Intent intent) {
        intent.putExtra("extra_conversation_message_type", this.A00);
        intent.putExtra("extra_jid", C627336j.A07(this.A0E));
        intent.putExtra("extra_receiver_jid", C627336j.A07(this.A0G));
        intent.putExtra("extra_quoted_msg_row_id", this.A02);
        intent.putExtra("extra_payment_preset_amount", this.A0k);
        intent.putExtra("extra_transaction_id", this.A0o);
        intent.putExtra("extra_payment_preset_min_amount", this.A0m);
        intent.putExtra("extra_payment_preset_max_amount", this.A0l);
        intent.putExtra("extra_request_message_key", this.A0n);
        intent.putExtra("extra_is_pay_money_only", this.A0u);
        intent.putExtra("extra_payment_note", this.A0j);
        intent.putExtra("extra_payment_background", this.A0B);
        intent.putExtra("extra_payment_sticker", this.A0c);
        intent.putExtra("extra_payment_sticker_send_origin", this.A0f);
        List list = this.A0r;
        if (list != null) {
            intent.putExtra("extra_mentioned_jids", C624435a.A01(list));
        }
        intent.putExtra("extra_inviter_jid", C627336j.A07(this.A0F));
        intent.putExtra("extra_receiver_jid", C627336j.A07(this.A0G));
        intent.putExtra("extra_in_setup", this.A0k);
        intent.putExtra("extra_setup_mode", this.A03);
        intent.putExtra("extra_payment_handle", this.A0I);
        intent.putExtra("extra_payment_handle_id", this.A0h);
        intent.putExtra("extra_merchant_code", this.A0Z);
        intent.putExtra("extra_transaction_ref", this.A0g);
        intent.putExtra("extra_payee_name", this.A0G);
        intent.putExtra("extra_transaction_ref_url", this.A0d);
        intent.putExtra("extra_purpose_code", this.A0c);
        intent.putExtra("extra_initiation_mode", this.A0Y);
        intent.putExtra("extra_incoming_pay_request_id", this.A0X);
        intent.putExtra("extra_selected_bank", this.A0K);
        intent.putExtra("extra_payment_bank_account_added_in_onboarding", this.A0A);
        intent.putExtra("extra_payments_entry_type", this.A02);
        intent.putExtra("extra_is_first_payment_method", this.A0l);
        intent.putExtra("extra_skip_value_props_display", this.A0o);
        intent.putExtra("extra_transaction_type", this.A0p);
        intent.putExtra("extra_transaction_token", this.A0q);
        intent.putExtra("extra_transaction_is_merchant", this.A0t);
        intent.putExtra("extra_transaction_is_valid_merchant", this.A0v);
        intent.putExtra("extra_banner_type", this.A00);
        intent.putExtra("extra_payment_flow_entry_point", this.A01);
        intent.putExtra("extra_referral_screen", this.A0e);
        intent.putExtra("extra_order_type", this.A0i);
        intent.putExtra("extra_payment_config_id", this.A0h);
        intent.putExtra("extra_order_formatted_discount_amount", this.A0F);
        intent.putExtra("extra_payment_method_type", this.A0a);
        intent.putExtra("extra_external_payment_source", this.A0g);
        intent.putExtra("extra_is_interop_add_payment_method", this.A0s);
    }

    public void A7P(Menu menu) {
        if (this.A0D.A0X(732)) {
            AnonymousClass97T.A0e(this, menu.add(0, R.id.menuitem_help, 0, this.A00.A0C(R.string.f11nameremoved)), R.drawable.ic_settings_help);
        }
    }

    public final void A7R(AnonymousClass99H r5, AnonymousClass34V r6, AnonymousClass9VW r7, String str) {
        this.A0S.BKB(C18290x4.A0Z(), (Integer) null, str, (String) null);
        this.A0M.B1N(this.A0L.A04(r5), true);
        if (this instanceof IndiaUpiDeviceBindStepActivity) {
            IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity = (IndiaUpiDeviceBindStepActivity) this;
            if (r6.A00 == 11473) {
                indiaUpiDeviceBindStepActivity.A01 = 1;
                indiaUpiDeviceBindStepActivity.A7e(new AnonymousClass9VW(R.string.f11nameremoved), true);
            } else {
                indiaUpiDeviceBindStepActivity.A01 = 7;
                indiaUpiDeviceBindStepActivity.A7e(r7, true);
            }
        } else if (this instanceof IndiaUpiBankAccountPickerActivity) {
            IndiaUpiBankAccountPickerActivity indiaUpiBankAccountPickerActivity = (IndiaUpiBankAccountPickerActivity) this;
            if (r6.A00 == 11473) {
                indiaUpiBankAccountPickerActivity.A00 = 1;
                indiaUpiBankAccountPickerActivity.A7Y(new AnonymousClass9VW(R.string.f11nameremoved), true);
            } else {
                indiaUpiBankAccountPickerActivity.A00 = 7;
                indiaUpiBankAccountPickerActivity.A7Y(r7, true);
            }
        }
        AnonymousClass9U1 r3 = this.A0L;
        ArrayList arrayList = r3.A07;
        if (arrayList != null && arrayList.size() > 1) {
            r3.A01++;
        }
        ArrayList A082 = r3.A08(r5);
        if (A082 != null) {
            int size = A082.size();
            r3.A00 = size;
            int i = r3.A02 + 1;
            if (i != size) {
                r3.A02 = i;
                return;
            }
        }
        r3.A02 = 0;
    }

    public void A7S(String str) {
        Intent intent;
        String str2;
        int i = this.A02;
        switch (i) {
            case 0:
                Log.e("Entry point not provided while onboarding");
            case 6:
            case 11:
                if (!this.A0l) {
                    C133686hm r0 = this.A0A;
                    if (r0 != null) {
                        AnonymousClass99H r02 = (AnonymousClass99H) r0.A08;
                        if (r02 != null) {
                            if (!AnonymousClass001.A1Z(C1899593h.A0X(r02.A05))) {
                                intent = C18320x8.A07();
                                intent.setClassName(getPackageName(), "com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity");
                                intent.putExtra("extra_bank_account", this.A0A);
                                intent.putExtra("extra_payment_method_type", this.A0a);
                                intent.putExtra("event_screen", "setup_pin");
                                break;
                            }
                        } else {
                            str2 = "Invalid bank's country data";
                        }
                    } else {
                        str2 = "Invalid Bank Account added is null";
                    }
                    Log.e(str2);
                    finish();
                    return;
                }
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
            case 9:
            case 10:
                A7H();
                intent = C18320x8.A07();
                intent.setClassName(getPackageName(), "com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity");
                break;
            default:
                C18260x0.A0y("No implementation for payments entry point ", AnonymousClass001.A0o(), i);
                return;
        }
        A7H();
        intent = C18320x8.A07();
        intent.setClassName(getPackageName(), "com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity");
        A7O(intent);
        C1899593h.A0k(intent, this, "extra_previous_screen", str);
    }

    public boolean A7T() {
        if (this.A0G == null && this.A0E == null && !C161527pr.A02(this.A0I)) {
            return true;
        }
        return false;
    }

    public boolean A7U(AnonymousClass99H r7, AnonymousClass34V r8, String str) {
        AnonymousClass9VW r1;
        int i;
        int i2 = r8.A00;
        if (i2 != 11473) {
            if (i2 == 11474) {
                i = R.string.f11nameremoved;
            } else if (i2 != 11484) {
                if (i2 != 11498) {
                    if (i2 != 11500) {
                        if (i2 != 11534) {
                            if (i2 != 20686) {
                                switch (i2) {
                                    case 21143:
                                        break;
                                    case 21144:
                                    case 21145:
                                        break;
                                    default:
                                        switch (i2) {
                                            case 21147:
                                            case 21148:
                                            case 21149:
                                            case 21150:
                                                break;
                                        }
                                }
                            }
                        }
                    }
                    r1 = new AnonymousClass9VW(i2, str);
                    A7R(r7, r8, r1, "retry_device_binding_on_error");
                    return true;
                }
                this.A0S.BKB(0, (Integer) null, "updated_onboarding_error_strings", (String) null);
                return false;
            } else {
                i = R.string.f11nameremoved;
            }
            r1 = new AnonymousClass9VW(i);
            A7R(r7, r8, r1, "retry_device_binding_on_error");
            return true;
        } else if (this.A0D.A0X(1685)) {
            A7R(r7, r8, new AnonymousClass9VW(r8.A00, str), "retry_device_binding_xh_error");
            return true;
        }
        return false;
    }

    public String BBy() {
        AnonymousClass3ZH r1 = this.A08;
        if (r1 == null) {
            return (String) C1899593h.A0X(this.A0I);
        }
        return this.A06.A0H(r1);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1000) {
            A7H();
            finish();
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        C160757oG r2 = this.A0p;
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append(this);
        C1899593h.A1J(r2, " onBackPressed", A0o2);
        A7H();
        finish();
        super.onBackPressed();
    }

    public void A6O(int i) {
        A7H();
        finish();
    }

    public String A7F(String str) {
        try {
            PhoneUserJid A2m = AnonymousClass4SG.A2m(this);
            C626936e.A06(A2m);
            String rawString = A2m.getRawString();
            try {
                MessageDigest instance = MessageDigest.getInstance("SHA-256");
                long A0H2 = this.A06.A0H();
                byte[] bArr = new byte[8];
                for (int i = 7; i >= 0; i--) {
                    bArr[i] = (byte) ((int) A0H2);
                    A0H2 >>= 8;
                }
                instance.update(bArr);
                instance.update(rawString.getBytes());
                byte[] bArr2 = new byte[16];
                new SecureRandom().nextBytes(bArr2);
                instance.update(bArr2);
                byte[] bArr3 = new byte[15];
                System.arraycopy(instance.digest(), 0, bArr3, 0, 15);
                return A7G(str, C627236i.A06(bArr3));
            } catch (NoSuchAlgorithmException e) {
                this.A0p.A08("payment", "generateUuid unable to hash due to missing sha256 algorithm", e);
                return null;
            }
        } catch (Exception e2) {
            this.A0p.A08("payment", "generateUuid unable to hash due to missing phone user jid", e2);
            return null;
        }
    }

    public String A7G(String str, String str2) {
        int length = str.length();
        if (length <= 8) {
            String A0T2 = AnonymousClass000.A0T(str, str2);
            if (A0T2.length() > 35) {
                return A0T2.substring(0, 35);
            }
            return A0T2;
        }
        throw AnonymousClass001.A0c(this.A0p.A02(AnonymousClass000.A0Y("prefixAndTruncate called with too long a prefix: ", AnonymousClass001.A0o(), length)));
    }

    public void A7K(int i, int i2) {
        Toolbar A072 = C1899593h.A07(this);
        setSupportActionBar(A072);
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            C1899593h.A0h(this);
            getWindow().setStatusBarColor(AnonymousClass0Y8.A04(this, R.color.f5nameremoved));
            C86604Kt.A0z(this, A072, AnonymousClass5Yj.A01(this));
            supportActionBar.A0E(AnonymousClass0RP.A00(this, i));
            supportActionBar.A0Q(false);
            A072.setOverflowIcon(C107335b8.A0B(AnonymousClass0RP.A00(this, R.drawable.vec_ic_more), AnonymousClass0Y8.A04(this, R.color.f5nameremoved)));
            View findViewById = findViewById(i2);
            if (findViewById != null) {
                findViewById.getViewTreeObserver().addOnScrollChangedListener(new C204419pK(this, findViewById, supportActionBar, 1));
            }
        }
    }

    public void A7L(int i, int i2, int i3) {
        A7K(R.drawable.onboarding_actionbar_home_close, i3);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.toolbar);
        TextView textView = (TextView) AnonymousClass001.A0R(LayoutInflater.from(this), viewGroup, R.layout.f8nameremoved);
        AnonymousClass0x2.A0q(this, textView, i2);
        textView.setText(i);
        viewGroup.addView(textView);
    }

    public void A7N(int i, String str, String str2) {
        C19340zH A002 = AnonymousClass5V0.A00(this);
        A002.A0T(i);
        A7Q(A002, str, str2);
    }

    public final void A7Q(AnonymousClass0Uj r5, String str, String str2) {
        r5.setPositiveButton(R.string.f11nameremoved, new AnonymousClass9X3(this, str2, str));
        r5.setNegativeButton(R.string.f11nameremoved, new C204359pE(1));
        r5.A0R(true);
        r5.A0S();
        this.A0S.BKB(C18290x4.A0Z(), 39, str, (String) null);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1899593h.A1H(this.A0p, this, "onCreate", AnonymousClass001.A0o());
        this.A0J.A01(new C195229Ws(this, 1));
        if (getIntent() != null) {
            boolean z = false;
            this.A0k = getIntent().getBooleanExtra("extra_in_setup", false);
            this.A03 = getIntent().getIntExtra("extra_setup_mode", 1);
            this.A0I = (C166557yt) getIntent().getParcelableExtra("extra_payment_handle");
            this.A0h = getIntent().getStringExtra("extra_payment_handle_id");
            this.A0Z = getIntent().getStringExtra("extra_merchant_code");
            this.A0g = getIntent().getStringExtra("extra_transaction_ref");
            this.A0G = (C166557yt) getIntent().getParcelableExtra("extra_payee_name");
            this.A0H = (C166557yt) getIntent().getParcelableExtra("extra_payment_upi_number");
            this.A0d = getIntent().getStringExtra("extra_transaction_ref_url");
            this.A0c = getIntent().getStringExtra("extra_purpose_code");
            this.A0Y = getIntent().getStringExtra("extra_initiation_mode");
            this.A0X = getIntent().getStringExtra("extra_incoming_pay_request_id");
            this.A0K = (AnonymousClass99H) getIntent().getParcelableExtra("extra_selected_bank");
            this.A0A = (C133686hm) getIntent().getParcelableExtra("extra_payment_bank_account_added_in_onboarding");
            this.A02 = getIntent().getIntExtra("extra_payments_entry_type", 0);
            this.A0l = getIntent().getBooleanExtra("extra_is_first_payment_method", true);
            this.A0o = getIntent().getBooleanExtra("extra_skip_value_props_display", true);
            this.A00 = getIntent().getIntExtra("extra_banner_type", 0);
            this.A01 = getIntent().getIntExtra("extra_payment_flow_entry_point", 0);
            boolean booleanExtra = getIntent().getBooleanExtra("extra_should_open_transaction_detail_after_send_override", false);
            int i = this.A01;
            if (i == 2 || i == 3 || booleanExtra) {
                z = true;
            }
            this.A0w = z;
            this.A0e = C1899593h.A0a(this);
            this.A0b = getIntent().getStringExtra("extra_previous_screen");
            this.A0F = (C166557yt) getIntent().getParcelableExtra("extra_order_formatted_discount_amount");
            this.A0a = getIntent().getStringExtra("extra_payment_method_type");
        }
        if (this.A0O.A02.A0X(698)) {
            this.A0R.A0E();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        C160757oG r2 = this.A0p;
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append(this);
        C1899593h.A1J(r2, " action bar home", A0o2);
        A7H();
        finish();
        return true;
    }

    public void onResume() {
        super.onResume();
        if (this.A0J.A02()) {
            AnonymousClass9VH.A00(this);
        }
    }
}
