package com.appdev.jeb.bieng6.service;

import com.appdev.jeb.bieng6.entity.AuditLog;
import com.appdev.jeb.bieng6.repository.AuditLogRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AuditLogService {
    private final AuditLogRepository auditLogRepository;

    public AuditLogService(AuditLogRepository auditLogRepository) {
        this.auditLogRepository = auditLogRepository;
    }

    public List<AuditLog> getAllLogs() {
        return auditLogRepository.findAll();
    }

    public Optional<AuditLog> getLogById(Long id) {
        return auditLogRepository.findById(id);
    }

    public AuditLog saveLog(AuditLog log) {
        return auditLogRepository.save(log);
    }

    public void deleteLog(Long id) {
        auditLogRepository.deleteById(id);
    }
}
