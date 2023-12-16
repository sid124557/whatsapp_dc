package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealReason;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ViolationCategory;

/* renamed from: X.382  reason: invalid class name */
public final class AnonymousClass382 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C28521hF[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        GraphQLXWA2AppealReason valueOf;
        GraphQLXWA2AppealState valueOf2 = GraphQLXWA2AppealState.valueOf(AnonymousClass0x2.A0a(parcel));
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = GraphQLXWA2AppealReason.valueOf(parcel.readString());
        }
        return new C28521hF(valueOf, valueOf2, GraphQLXWA2ViolationCategory.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
    }
}
