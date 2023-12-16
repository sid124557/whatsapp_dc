package X;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.CopyableTextView;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity;
import com.whatsapp.payments.ui.PaymentDeleteAccountActivity;
import com.whatsapp.payments.ui.widget.PayToolbar;
import com.whatsapp.util.Log;

/* renamed from: X.9C3  reason: invalid class name */
public abstract class AnonymousClass9C3 extends AnonymousClass97W implements View.OnClickListener {
    public int A00;
    public TextView A01;
    public TextView A02;
    public CopyableTextView A03;
    public C69263Wi A04;
    public AnonymousClass5WY A05;
    public C56492s4 A06;
    public C620733j A07;
    public C166587yw A08;
    public AnonymousClass33K A09;
    public C1906899l A0A;
    public C29261iX A0B;
    public C153087ae A0C;
    public AnonymousClass9U4 A0D;
    public AnonymousClass9H2 A0E;
    public AnonymousClass9TV A0F;
    public C158777kX A0G;
    public PayToolbar A0H;
    public AnonymousClass4FS A0I;
    public boolean A0J;
    public final C84044Au A0K = new C196769bi(this);
    public final C160757oG A0L = C160757oG.A00("PaymentMethodDetailsActivity", "payment-settings", "COMMON");

    public final int A74(int i) {
        TypedArray typedArray;
        try {
            typedArray = obtainStyledAttributes(i, new int[]{16843071});
        } catch (Resources.NotFoundException e) {
            Log.e(e.getMessage());
            typedArray = null;
        }
        if (typedArray != null) {
            return typedArray.getDimensionPixelOffset(0, -1);
        }
        return -1;
    }

    public void A77(boolean z) {
        IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity = (IndiaUpiBankAccountDetailsActivity) this;
        if (z) {
            indiaUpiBankAccountDetailsActivity.A0L.A06("unlinking the payment account.");
            Intent A082 = AnonymousClass0x9.A08(indiaUpiBankAccountDetailsActivity, PaymentDeleteAccountActivity.class);
            A082.putExtra("extra_remove_payment_account", 1);
            indiaUpiBankAccountDetailsActivity.startActivityForResult(A082, 0);
            return;
        }
        indiaUpiBankAccountDetailsActivity.Bp9(R.string.f11nameremoved);
        indiaUpiBankAccountDetailsActivity.A0D.Bq0();
        C197109ca r2 = indiaUpiBankAccountDetailsActivity.A0D;
        C204549pX r7 = new C204549pX(new C204519pU(r2, 5, indiaUpiBankAccountDetailsActivity), r2, indiaUpiBankAccountDetailsActivity, 0);
        AnonymousClass99H A0I2 = C1899693i.A0I(indiaUpiBankAccountDetailsActivity.A0L, indiaUpiBankAccountDetailsActivity.A00.A08, "IndiaUpiBankAccountDetailsActivity onRemovePaymentMethod Unable to get IndiaUpiMethodData");
        AnonymousClass9AK r4 = indiaUpiBankAccountDetailsActivity.A0C;
        C166557yt r5 = A0I2.A09;
        String str = A0I2.A0F;
        C166557yt r6 = A0I2.A06;
        String str2 = indiaUpiBankAccountDetailsActivity.A00.A0A;
        if (C161527pr.A02(r5)) {
            r4.A07.A01(r4.A01, (C153607bd) null, new AnonymousClass9c2(r6, r7, r4, str2));
        } else {
            r4.A00(r5, r6, r7, str, str2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x010e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r15) {
        /*
            r14 = this;
            r11 = r14
            super.onCreate(r15)
            boolean r6 = r14 instanceof com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity
            if (r6 == 0) goto L_0x0052
            r7 = 1
            r0 = 2131624913(0x7f0e03d1, float:1.887702E38)
        L_0x000c:
            r14.setContentView((int) r0)
            r0 = 2131433257(0x7f0b1729, float:1.8488295E38)
            android.view.View r2 = r14.findViewById(r0)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.LayoutInflater r1 = r14.getLayoutInflater()
            r0 = 2131625678(0x7f0e06ce, float:1.887857E38)
            r3 = 0
            android.view.View r0 = r1.inflate(r0, r3)
            r2.addView(r0)
            android.content.Intent r0 = r14.getIntent()
            if (r0 == 0) goto L_0x0047
            android.os.Bundle r0 = X.C86614Ku.A0D(r14)
            if (r0 == 0) goto L_0x0047
            android.os.Bundle r0 = X.C86614Ku.A0D(r14)
            java.lang.String r5 = "extra_bank_account"
            java.lang.Object r0 = r0.get(r5)
            java.lang.String r4 = "extra_bank_account_or_card_credential_id"
            if (r0 != 0) goto L_0x0057
            java.lang.String r0 = X.C1899693i.A0a(r14, r4)
            if (r0 != 0) goto L_0x0057
        L_0x0047:
            X.7oG r1 = r14.A0L
            java.lang.String r0 = "got null bank account; finishing"
            r1.A04(r0)
            r14.finish()
            return
        L_0x0052:
            r7 = 0
            r0 = 2131625677(0x7f0e06cd, float:1.8878569E38)
            goto L_0x000c
        L_0x0057:
            if (r7 == 0) goto L_0x0067
            r0 = 2131432115(0x7f0b12b3, float:1.8485978E38)
            android.view.View r0 = r14.findViewById(r0)
            com.whatsapp.payments.ui.widget.PayToolbar r0 = (com.whatsapp.payments.ui.widget.PayToolbar) r0
            r14.A0H = r0
            r14.setSupportActionBar(r0)
        L_0x0067:
            if (r6 == 0) goto L_0x0119
            r1 = r11
            com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity r1 = (com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity) r1
            X.99n r0 = r1.A06
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x007c
            X.99n r0 = r1.A06
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x0119
        L_0x007c:
            X.3Wi r9 = r14.A04
            X.4FS r13 = r14.A0I
            X.33j r10 = r14.A07
            X.7kX r12 = r14.A0G
            X.9BI r8 = new X.9BI
            r8.<init>(r9, r10, r11, r12, r13)
        L_0x0089:
            r14.A0F = r8
            r8.A01()
            r0 = 2131432197(0x7f0b1305, float:1.8486145E38)
            android.widget.TextView r0 = X.C18310x6.A0L(r14, r0)
            r14.A02 = r0
            r0 = 2131432194(0x7f0b1302, float:1.8486139E38)
            android.view.View r0 = r14.findViewById(r0)
            com.whatsapp.CopyableTextView r0 = (com.whatsapp.CopyableTextView) r0
            r14.A03 = r0
            r0 = 2131432195(0x7f0b1303, float:1.848614E38)
            android.widget.TextView r0 = X.C18310x6.A0L(r14, r0)
            r14.A01 = r0
            r0 = 2131102437(0x7f060ae5, float:1.7817312E38)
            if (r7 == 0) goto L_0x00b3
            r0 = 2131100470(0x7f060336, float:1.7813322E38)
        L_0x00b3:
            int r0 = X.AnonymousClass0Y8.A04(r14, r0)
            r14.A00 = r0
            r0 = 2131430575(0x7f0b0caf, float:1.8482855E38)
            android.widget.ImageView r1 = X.C86654Ky.A0M(r14, r0)
            int r0 = r14.A00
            X.C107335b8.A0E(r1, r0)
            r0 = 2131430577(0x7f0b0cb1, float:1.8482859E38)
            android.view.View r0 = r14.findViewById(r0)
            r0.setOnClickListener(r14)
            X.1iX r1 = r14.A0B
            X.4Au r0 = r14.A0K
            r1.A06(r0)
            android.os.Bundle r0 = X.C86614Ku.A0D(r14)
            java.lang.Object r1 = r0.get(r5)
            android.os.Bundle r0 = X.C86614Ku.A0D(r14)
            if (r1 == 0) goto L_0x010e
            java.lang.Object r0 = r0.get(r5)
            X.7yw r0 = (X.C166587yw) r0
            java.lang.String r3 = r0.A0A
        L_0x00ec:
            r0 = 2131890537(0x7f121169, float:1.9415769E38)
            r14.Bp9(r0)
            X.9U4 r0 = r14.A0D
            X.9Tl r0 = X.AnonymousClass9U4.A00(r0)
            X.C626936e.A06(r3)
            X.3XA r2 = X.C194569Tl.A00(r0, r3)
            r0 = 8
            X.9qF r1 = new X.9qF
            r1.<init>(r14, r0)
            X.3Wi r0 = r14.A04
            java.util.concurrent.Executor r0 = r0.A08
            r2.A04(r1, r0)
            return
        L_0x010e:
            java.lang.Object r0 = r0.get(r4)
            if (r0 == 0) goto L_0x00ec
            java.lang.String r3 = X.C1899693i.A0a(r14, r4)
            goto L_0x00ec
        L_0x0119:
            boolean r0 = r14 instanceof com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity
            if (r0 == 0) goto L_0x0137
            r2 = r11
            com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity r2 = (com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity) r2
            android.os.Bundle r0 = X.C86614Ku.A0D(r2)
            java.lang.Object r1 = r0.get(r5)
            X.7yw r1 = (X.C166587yw) r1
            X.9W6 r0 = r2.A07
            boolean r0 = r0.A06(r1)
            X.9BH r8 = new X.9BH
            r8.<init>(r2, r0)
            goto L_0x0089
        L_0x0137:
            X.9TV r8 = new X.9TV
            r8.<init>(r14)
            goto L_0x0089
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9C3.onCreate(android.os.Bundle):void");
    }

    public Dialog onCreateDialog(int i) {
        CharSequence charSequence;
        int i2;
        boolean z = true;
        switch (i) {
            case 200:
                i2 = R.string.f11nameremoved;
                break;
            case 201:
                C158777kX r2 = this.A0G;
                C166587yw r0 = this.A08;
                C162457s7.A0J(r0, 0);
                z = false;
                charSequence = AnonymousClass002.A0F(this, r2.A02(r0, true), new Object[1], 0, R.string.f11nameremoved);
                break;
            case 202:
                i2 = R.string.f11nameremoved;
                break;
            default:
                return super.onCreateDialog(i);
        }
        charSequence = C107345b9.A05(this, this.A0C, getString(i2));
        String string = getString(R.string.f11nameremoved);
        int i3 = 201;
        if (z) {
            i3 = 200;
        }
        C19340zH A012 = AnonymousClass5V0.A01(this, R.style.f12nameremoved);
        A012.A0g(charSequence);
        A012.A0i(true);
        A012.A0W(new C204429pL(this, i3, 3), R.string.f11nameremoved);
        A012.A00.A0I(new C204299p8(this, i3, 1, z), string);
        A012.A0V(new C204239p2(this, i3, 3));
        if (!z) {
            A012.setTitle(getString(R.string.f11nameremoved));
        }
        return A012.create();
    }

    public void A75() {
        AnonymousClass9NP r2;
        AnonymousClass4FS r5 = this.A0I;
        AnonymousClass9U4 r4 = this.A0D;
        C160757oG r3 = this.A0L;
        if (this instanceof IndiaUpiBankAccountDetailsActivity) {
            r2 = new AnonymousClass9NP((IndiaUpiBankAccountDetailsActivity) this);
        } else {
            r2 = null;
        }
        C18270x1.A0w(new C191769Gj(r4, r3, r2, new AnonymousClass9NW(this)), r5);
    }

    public void onStop() {
        this.A0B.A07(this.A0K);
        super.onStop();
    }

    public void A6O(int i) {
        if (i == R.string.f11nameremoved) {
            finish();
        }
    }

    public void A76(C166587yw r3, boolean z) {
        int i;
        BjL();
        if (r3 == null) {
            finish();
            return;
        }
        this.A08 = r3;
        this.A0J = AnonymousClass000.A1U(r3.A01, 2);
        this.A02.setText((CharSequence) C1899593h.A0X(r3.A09));
        ImageView A0M = C86654Ky.A0M(this, R.id.payment_method_icon);
        if (r3 instanceof C133736hr) {
            i = C195169Wk.A00(((C133736hr) r3).A01);
        } else {
            Bitmap A092 = r3.A09();
            if (A092 != null) {
                A0M.setImageBitmap(A092);
                this.A0F.A02(r3, z);
            }
            i = R.drawable.av_bank;
        }
        A0M.setImageResource(i);
        this.A0F.A02(r3, z);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 0 && i2 == -1) {
            Intent A072 = C18320x8.A07();
            int i3 = 0;
            if (intent != null) {
                i3 = intent.getIntExtra("extra_remove_payment_account", 0);
            }
            A072.putExtra("extra_remove_payment_account", i3);
            setResult(-1, A072);
            finish();
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.default_payment_method_row) {
            if (!this.A0J) {
                Bp9(R.string.f11nameremoved);
                if (this instanceof C191109By) {
                    C191109By r5 = (C191109By) this;
                    r5.A7A(new AnonymousClass9bP((C203549nv) null, (C203499no) null, r5, 0), r5.A08.A0A, (String) null);
                    return;
                }
                IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity = (IndiaUpiBankAccountDetailsActivity) this;
                if (indiaUpiBankAccountDetailsActivity.A06.A0Q()) {
                    Intent A052 = C1899593h.A05(indiaUpiBankAccountDetailsActivity);
                    A052.putExtra("extra_payments_entry_type", 7);
                    C1899593h.A0k(A052, indiaUpiBankAccountDetailsActivity, "extra_referral_screen", "payment_bank_account_details");
                    return;
                }
                indiaUpiBankAccountDetailsActivity.Bp9(R.string.f11nameremoved);
                indiaUpiBankAccountDetailsActivity.A0D.Bq0();
                AnonymousClass9bP r9 = new AnonymousClass9bP(indiaUpiBankAccountDetailsActivity.A04, indiaUpiBankAccountDetailsActivity.A0D, indiaUpiBankAccountDetailsActivity, 15);
                AnonymousClass99H A0I2 = C1899693i.A0I(indiaUpiBankAccountDetailsActivity.A0L, indiaUpiBankAccountDetailsActivity.A00.A08, "onMakeDefaultPaymentMethod Unable to get IndiaUpiMethodData");
                AnonymousClass9AK r6 = indiaUpiBankAccountDetailsActivity.A0C;
                C166557yt r7 = A0I2.A09;
                String str = A0I2.A0F;
                C166557yt r8 = A0I2.A06;
                String str2 = indiaUpiBankAccountDetailsActivity.A00.A0A;
                if (C161527pr.A02(r7)) {
                    r6.A07.A01(r6.A01, (C153607bd) null, new AnonymousClass9c5(r8, r9, r6, str2, true, false));
                } else {
                    r6.A01(r7, r8, r9, str, str2, true, false);
                }
            }
        } else if (view.getId() == R.id.help_row) {
            AnonymousClass4FS r2 = this.A0I;
            AnonymousClass9H2 r0 = this.A0E;
            if (r0 != null && r0.A06() == 1) {
                this.A0E.A0D(false);
            }
            Bundle A082 = AnonymousClass002.A08();
            A082.putString("com.whatsapp.support.DescribeProblemActivity.from", "payments:account-details");
            C133796hx r02 = this.A08.A08;
            if (r02 != null) {
                A082.putString("com.whatsapp.support.DescribeProblemActivity.paymentBankPhone", r02.A09());
            }
            C56492s4 r82 = this.A06;
            C66663Mh r72 = this.A06;
            AnonymousClass9H2 r3 = new AnonymousClass9H2(A082, this, this.A05, r72, r82, this.A07, this.A08, (C624034w) null, this.A09, this.A0C, "payments:account-details");
            this.A0E = r3;
            C18270x1.A0w(r3, r2);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.id.menuitem_remove_payment_method, 0, getString(R.string.f11nameremoved));
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        } else if (menuItem.getItemId() != R.id.menuitem_remove_payment_method) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            A75();
            return true;
        }
    }
}
