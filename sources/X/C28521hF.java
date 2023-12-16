package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealReason;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ViolationCategory;

/* renamed from: X.1hF  reason: invalid class name and case insensitive filesystem */
public final class C28521hF extends AnonymousClass38T {
    public static final Parcelable.Creator CREATOR = new AnonymousClass382();
    public final GraphQLXWA2AppealReason A00;
    public final GraphQLXWA2AppealState A01;
    public final GraphQLXWA2ViolationCategory A02;
    public final String A03;
    public final String A04;

    public C28521hF(GraphQLXWA2AppealReason graphQLXWA2AppealReason, GraphQLXWA2AppealState graphQLXWA2AppealState, GraphQLXWA2ViolationCategory graphQLXWA2ViolationCategory, String str, String str2) {
        C18260x0.A0b(graphQLXWA2AppealState, graphQLXWA2ViolationCategory, str2, 1);
        this.A01 = graphQLXWA2AppealState;
        this.A00 = graphQLXWA2AppealReason;
        this.A04 = str;
        this.A02 = graphQLXWA2ViolationCategory;
        this.A03 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28521hF) {
                C28521hF r5 = (C28521hF) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00 && C162457s7.A0P(this.A04, r5.A04) && this.A02 == r5.A02 && C162457s7.A0P(this.A03, r5.A03))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        C18290x4.A1D(parcel, this.A01);
        GraphQLXWA2AppealReason graphQLXWA2AppealReason = this.A00;
        if (graphQLXWA2AppealReason == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            C18290x4.A1D(parcel, graphQLXWA2AppealReason);
        }
        parcel.writeString(this.A04);
        C18290x4.A1D(parcel, this.A02);
        parcel.writeString(this.A03);
    }

    public int hashCode() {
        return AnonymousClass0x7.A08(this.A03, AnonymousClass000.A08(this.A02, (((C18300x5.A04(this.A01) + AnonymousClass000.A07(this.A00)) * 31) + AnonymousClass0x7.A07(this.A04)) * 31));
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Geosuspension(appealState=");
        A0o.append(this.A01);
        A0o.append(", appealReason=");
        A0o.append(this.A00);
        A0o.append(", creationTime=");
        A0o.append(this.A04);
        A0o.append(", violationCategory=");
        A0o.append(this.A02);
        A0o.append(", countryCode=");
        return C18260x0.A07(this.A03, A0o);
    }
}
