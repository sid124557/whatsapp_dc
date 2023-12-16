package X;

import com.whatsapp.R;
import com.whatsapp.inappsupport.ui.SupportBkLayoutViewModel;
import com.whatsapp.util.Log;
import com.whatsapp.wabloks.commerce.ui.viewmodel.WaBkExtensionsLayoutViewModel;

/* renamed from: X.10r  reason: invalid class name */
public abstract class AnonymousClass10r extends C05550Ty {
    public C06270Wx A00;
    public AnonymousClass08M A01;
    public boolean A02;
    public final C183538qC A03;

    public final void A0D() {
        if (!this.A02) {
            throw AnonymousClass001.A0e("BkLayoutViewModel must be initialized");
        }
    }

    public void A0E(C47382dA r9, AnonymousClass39C r10, String str, String str2, String str3) {
        if (!this.A02) {
            this.A02 = true;
            AnonymousClass08J r3 = new AnonymousClass08J();
            AnonymousClass08M A012 = AnonymousClass08M.A01();
            this.A01 = A012;
            r3.A0J(A012, new AnonymousClass4K7(r3, 8, this));
            this.A00 = r3;
            ((C55552qX) this.A03.get()).A03(r10, new AnonymousClass3XZ(this.A01, r9), (Boolean) null, str, str2, str3);
        }
    }

    public boolean A0F(C46202bF r8) {
        String A0Y;
        String str;
        String A0V;
        String str2;
        String str3;
        int i;
        String str4;
        if (this instanceof WaBkExtensionsLayoutViewModel) {
            WaBkExtensionsLayoutViewModel waBkExtensionsLayoutViewModel = (WaBkExtensionsLayoutViewModel) this;
            int i2 = r8.A00;
            if (i2 == 1) {
                str2 = "extensions-layout-request-error";
            } else if (i2 == 3) {
                str2 = "extensions-layout-null-error";
            } else if (i2 != 4) {
                if (i2 == 6) {
                    str2 = "extensions-layout-bloks-internal-error";
                } else if (i2 != 7) {
                    str2 = "extensions-layout-undefined-error";
                } else {
                    str2 = "extensions-layout-network-error";
                }
            } else if (waBkExtensionsLayoutViewModel.A03.A0Y(C58422vE.A02, 3228) || (str4 = waBkExtensionsLayoutViewModel.A00) == null || !C162457s7.A0P(AnonymousClass31O.A01(str4).get("flow_message_version"), "1")) {
                str2 = "extensions-layout-unexpected-error";
            } else {
                str2 = null;
            }
            int i3 = r8.A00;
            if (i3 == 1 || i3 == 3 || i3 == 4 || i3 == 6 || i3 == 7) {
                Exception exc = r8.A02;
                if (exc == null) {
                    str3 = null;
                } else if (exc instanceof AnonymousClass244) {
                    str3 = ((AnonymousClass244) exc).error.toString();
                } else {
                    str3 = exc.toString();
                }
                AnonymousClass4UC r2 = waBkExtensionsLayoutViewModel.A06;
                if (waBkExtensionsLayoutViewModel.A01.A0F()) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("ExtensionsLogger/WaBkExtensionsLayoutViewModel/handleError() - Unexpected error. Status :");
                    C18260x0.A1F(A0o, r8.A00);
                    i = R.string.f11nameremoved;
                } else {
                    Log.d("ExtensionsLogger/WaBkExtensionsLayoutViewModel/handleError() - Network error");
                    i = R.string.f11nameremoved;
                }
                r2.A0H(new C52692lt(i, str2, str3));
                return false;
            }
            C18260x0.A0w("ExtensionsLogger/WaBkExtensionsLayoutViewModel/handleError() - Unknown error. Status :", AnonymousClass001.A0o(), i3);
            C626936e.A0D(false, "BkLayoutViewModel: invalid error status");
            return false;
        } else if (this instanceof SupportBkLayoutViewModel) {
            SupportBkLayoutViewModel supportBkLayoutViewModel = (SupportBkLayoutViewModel) this;
            int i4 = r8.A00;
            if (i4 != 1) {
                if (i4 == 3) {
                    str = "NULL_LAYOUT";
                } else if (i4 == 4) {
                    str = "UNEXPECTED_ERROR";
                } else if (i4 == 6) {
                    str = "UNKNOWN";
                } else if (i4 != 7) {
                    supportBkLayoutViewModel.A02.A03(supportBkLayoutViewModel.A01, "UNKNOWN", supportBkLayoutViewModel.A00, 2);
                    supportBkLayoutViewModel.A03.A0H(C27761eb.A00);
                    A0V = "SupportBkLayoutViewModel/handleError: Error status unknown";
                } else {
                    supportBkLayoutViewModel.A02.A03(supportBkLayoutViewModel.A01, (String) null, supportBkLayoutViewModel.A00, 1);
                    Log.e("SupportBkLayoutViewModel/handleError: layout network");
                    supportBkLayoutViewModel.A03.A0H(C27751ea.A00);
                    return false;
                }
                supportBkLayoutViewModel.A02.A03(supportBkLayoutViewModel.A01, str, supportBkLayoutViewModel.A00, 2);
                supportBkLayoutViewModel.A03.A0H(AnonymousClass1eZ.A00);
                A0V = AnonymousClass000.A0V("SupportBkLayoutViewModel/handleError: layout fetch error. Status: ", str, AnonymousClass001.A0o());
            } else {
                str = "REQUEST_FAILED";
                supportBkLayoutViewModel.A02.A03(supportBkLayoutViewModel.A01, str, supportBkLayoutViewModel.A00, 2);
                supportBkLayoutViewModel.A03.A0H(AnonymousClass1eZ.A00);
                A0V = AnonymousClass000.A0V("SupportBkLayoutViewModel/handleError: layout fetch error. Status: ", str, AnonymousClass001.A0o());
            }
            Log.e(A0V);
            return false;
        } else {
            int i5 = r8.A00;
            if (i5 == 7) {
                A0Y = "Common/handleError: layout network";
            } else {
                A0Y = AnonymousClass000.A0Y("Common/handleError: Something went wrong ", AnonymousClass001.A0o(), i5);
            }
            Log.e(A0Y);
            return false;
        }
    }

    public AnonymousClass10r(C183538qC r1) {
        this.A03 = r1;
    }
}
