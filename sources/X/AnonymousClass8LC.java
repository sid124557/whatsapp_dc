package X;

import java.io.Serializable;

/* renamed from: X.8LC  reason: invalid class name */
public class AnonymousClass8LC implements Serializable {
    public static final long serialVersionUID = 1;
    public C141706w0 countryCodeSource_ = C141706w0.FROM_NUMBER_WITH_PLUS_SIGN;
    public int countryCode_ = 0;
    public String extension_ = "";
    public boolean hasCountryCode;
    public boolean hasCountryCodeSource;
    public boolean hasExtension;
    public boolean hasItalianLeadingZero;
    public boolean hasNationalNumber;
    public boolean hasPreferredDomesticCarrierCode;
    public boolean hasRawInput;
    public boolean hasSecondLeadingZero;
    public boolean italianLeadingZero_ = false;
    public long nationalNumber_ = 0;
    public String preferredDomesticCarrierCode_ = "";
    public String rawInput_ = "";
    public boolean secondLeadingZero_ = false;

    public boolean A01(AnonymousClass8LC r7) {
        if (r7 == null) {
            return false;
        }
        if (this == r7) {
            return true;
        }
        return this.countryCode_ == r7.countryCode_ && this.nationalNumber_ == r7.nationalNumber_ && this.extension_.equals(r7.extension_) && this.italianLeadingZero_ == r7.italianLeadingZero_ && this.rawInput_.equals(r7.rawInput_) && this.countryCodeSource_ == r7.countryCodeSource_ && this.preferredDomesticCarrierCode_.equals(r7.preferredDomesticCarrierCode_) && this.hasPreferredDomesticCarrierCode == r7.hasPreferredDomesticCarrierCode && this.secondLeadingZero_ == r7.secondLeadingZero_;
    }

    public void A00(AnonymousClass8LC r4) {
        if (r4.hasCountryCode) {
            int i = r4.countryCode_;
            this.hasCountryCode = true;
            this.countryCode_ = i;
        }
        if (r4.hasNationalNumber) {
            long j = r4.nationalNumber_;
            this.hasNationalNumber = true;
            this.nationalNumber_ = j;
        }
        if (r4.hasExtension) {
            String str = r4.extension_;
            str.getClass();
            this.hasExtension = true;
            this.extension_ = str;
        }
        if (r4.hasItalianLeadingZero) {
            boolean z = r4.italianLeadingZero_;
            this.hasItalianLeadingZero = true;
            this.italianLeadingZero_ = z;
        }
        if (r4.hasRawInput) {
            String str2 = r4.rawInput_;
            str2.getClass();
            this.hasRawInput = true;
            this.rawInput_ = str2;
        }
        if (r4.hasCountryCodeSource) {
            C141706w0 r1 = r4.countryCodeSource_;
            r1.getClass();
            this.hasCountryCodeSource = true;
            this.countryCodeSource_ = r1;
        }
        if (r4.hasPreferredDomesticCarrierCode) {
            String str3 = r4.preferredDomesticCarrierCode_;
            str3.getClass();
            this.hasPreferredDomesticCarrierCode = true;
            this.preferredDomesticCarrierCode_ = str3;
        }
        if (r4.hasSecondLeadingZero) {
            boolean z2 = r4.secondLeadingZero_;
            this.hasSecondLeadingZero = true;
            this.secondLeadingZero_ = z2;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass8LC) || !A01((AnonymousClass8LC) obj)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A02 = AnonymousClass002.A02(Long.valueOf(this.nationalNumber_), (2173 + this.countryCode_) * 53) * 53;
        int i = 1231;
        int A08 = ((AnonymousClass0x7.A08(this.preferredDomesticCarrierCode_, AnonymousClass002.A02(this.countryCodeSource_, AnonymousClass0x7.A08(this.rawInput_, ((AnonymousClass0x7.A08(this.extension_, A02) * 53) + AnonymousClass6C9.A05(this.italianLeadingZero_ ? 1 : 0)) * 53) * 53) * 53) * 53) + AnonymousClass6C9.A05(this.hasPreferredDomesticCarrierCode ? 1 : 0)) * 53;
        if (!this.secondLeadingZero_) {
            i = 1237;
        }
        return A08 + i;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Country Code: ");
        A0o.append(this.countryCode_);
        A0o.append(" National Number: ");
        A0o.append(this.nationalNumber_);
        if (this.hasItalianLeadingZero && this.italianLeadingZero_) {
            A0o.append(" Leading Zero: true");
        }
        if (this.hasExtension) {
            A0o.append(" Extension: ");
            A0o.append(this.extension_);
        }
        if (this.hasCountryCodeSource) {
            A0o.append(" Country Code Source: ");
            A0o.append(this.countryCodeSource_);
        }
        if (this.hasPreferredDomesticCarrierCode) {
            A0o.append(" Preferred Domestic Carrier Code: ");
            A0o.append(this.preferredDomesticCarrierCode_);
        }
        if (this.hasSecondLeadingZero && this.secondLeadingZero_) {
            A0o.append(" Second Leading Zero: true");
        }
        return A0o.toString();
    }
}
