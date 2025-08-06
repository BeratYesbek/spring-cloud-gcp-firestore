package com.beratyesbek.springcloudgcpfirestore;

import com.google.cloud.spring.data.firestore.FirestoreReactiveRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceRepository extends FirestoreReactiveRepository<Device> {
}
