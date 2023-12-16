package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealReason;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ViolationCategory;

/* renamed from: X.1hE  reason: invalid class name and case insensitive filesystem */
public final class C28511hE extends AnonymousClass38T {
    public static final Parcelable.Creator CREATOR = new AnonymousClass384();
    public final GraphQLXWA2AppealReason A00;
    public final GraphQLXWA2AppealState A01;
    public final GraphQLXWA2ViolationCategory A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28511hE) {
                C28511hE r5 = (C28511hE) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00 && this.A02 == r5.A02 && C162457s7.A0P(this.A03, r5.A03))) {
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
        C18290x4.A1D(parcel, this.A02);
        parcel.writeString(this.A03);
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A02, (C18300x5.A04(this.A01) + AnonymousClass000.A07(this.A00)) * 31) + AnonymousClass0x7.A07(this.A03);
    }

    public C28511hE(GraphQLXWA2AppealReason graphQLXWA2AppealReason, GraphQLXWA2AppealState graphQLXWA2AppealState, GraphQLXWA2ViolationCategory graphQLXWA2ViolationCategory, String str) {
        C18260x0.A0R(graphQLXWA2AppealState, graphQLXWA2ViolationCategory);
        this.A01 = graphQLXWA2AppealState;
        this.A00 = graphQLXWA2AppealReason;
        this.A02 = graphQLXWA2ViolationCategory;
        this.A03 = str;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Suspension(appealState=");
        A0o.append(this.A01);
        A0o.append(", appealReason=");
        A0o.append(this.A00);
        A0o.append(", violationCategory=");
        A0o.append(this.A02);
        A0o.append(", creationTime=");
        return C18260x0.A07(this.A03, A0o);
    }
}
