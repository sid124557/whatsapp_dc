package com.whatsapp;

import X.C372721p;
import X.C53042mS;
import X.C95804uY;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class InteractiveAnnotation implements Serializable {
    public static final long serialVersionUID = -3211751283609597L;
    public Object data;
    public SerializablePoint[] polygonVertices;
    public boolean skipConfirmation;

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(this.polygonVertices);
        Object obj = this.data;
        if (obj instanceof SerializableLocation) {
            objectOutputStream.writeObject(obj);
        }
    }

    public InteractiveAnnotation(Object obj, SerializablePoint[] serializablePointArr, boolean z) {
        this.polygonVertices = serializablePointArr;
        this.skipConfirmation = z;
        this.data = obj;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.polygonVertices = (SerializablePoint[]) objectInputStream.readObject();
        try {
            this.data = objectInputStream.readObject();
        } catch (Exception unused) {
        }
    }

    public InteractiveAnnotation(String str, SerializablePoint[] serializablePointArr, double d, double d2, boolean z) {
        this.polygonVertices = serializablePointArr;
        this.skipConfirmation = z;
        this.data = new SerializableLocation(str, d, d2);
    }

    public InteractiveAnnotation(C95804uY r2, C372721p r3, String str, SerializablePoint[] serializablePointArr, int i, boolean z) {
        this.polygonVertices = serializablePointArr;
        this.skipConfirmation = z;
        this.data = new C53042mS(r2, r3, str, i);
    }
}
