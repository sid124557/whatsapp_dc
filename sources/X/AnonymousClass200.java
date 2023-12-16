package X;

import com.whatsapp.Me;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

/* renamed from: X.200  reason: invalid class name */
public class AnonymousClass200 extends ObjectInputStream {
    public final /* synthetic */ C56972sr A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass200(C56972sr r1, InputStream inputStream) {
        super(inputStream);
        this.A00 = r1;
    }

    public ObjectStreamClass readClassDescriptor() {
        ObjectStreamClass readClassDescriptor = super.readClassDescriptor();
        if (readClassDescriptor.getName().equals("com.whatsapp.App$Me")) {
            return ObjectStreamClass.lookup(Me.class);
        }
        return readClassDescriptor;
    }
}
