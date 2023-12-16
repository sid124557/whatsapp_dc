package X;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;

/* renamed from: X.8Ko  reason: invalid class name and case insensitive filesystem */
public final class C172328Ko implements Externalizable {
    public static final long serialVersionUID = 0;
    public Collection collection;
    public final int tag;

    public void readExternal(ObjectInput objectInput) {
        Collection collection2;
        C162457s7.A0J(objectInput, 0);
        byte readByte = objectInput.readByte();
        byte b = readByte & 1;
        if ((readByte & -2) == 0) {
            int readInt = objectInput.readInt();
            if (readInt >= 0) {
                int i = 0;
                if (b == 0) {
                    AnonymousClass8U9 r1 = new AnonymousClass8U9(readInt);
                    while (i < readInt) {
                        r1.add(objectInput.readObject());
                        i++;
                    }
                    collection2 = C159507lx.A0h(r1);
                } else if (b == 1) {
                    AnonymousClass8UB r12 = new AnonymousClass8UB(new AnonymousClass8OR(readInt));
                    while (i < readInt) {
                        r12.add(objectInput.readObject());
                        i++;
                    }
                    collection2 = C154537dK.A08(r12);
                } else {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("Unsupported collection type tag: ");
                    A0o.append(b);
                    throw new InvalidObjectException(AnonymousClass001.A0j(A0o, '.'));
                }
                this.collection = collection2;
                return;
            }
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("Illegal size value: ");
            A0o2.append(readInt);
            throw new InvalidObjectException(AnonymousClass001.A0j(A0o2, '.'));
        }
        StringBuilder A0o3 = AnonymousClass001.A0o();
        A0o3.append("Unsupported flags value: ");
        A0o3.append(readByte);
        throw new InvalidObjectException(AnonymousClass001.A0j(A0o3, '.'));
    }

    public void writeExternal(ObjectOutput objectOutput) {
        C162457s7.A0J(objectOutput, 0);
        objectOutput.writeByte(this.tag);
        objectOutput.writeInt(this.collection.size());
        for (Object writeObject : this.collection) {
            objectOutput.writeObject(writeObject);
        }
    }

    private final Object readResolve() {
        return this.collection;
    }

    public C172328Ko(Collection collection2, int i) {
        this.collection = collection2;
        this.tag = i;
    }

    public C172328Ko() {
        this(C72023d3.A00, 0);
    }
}
